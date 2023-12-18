package com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    static final int ATTEMPTS_LIMIT = 10;
    static final int MIN = 0;
    static final int MAX = 100;
    private static final int ROUNDS = 3;
    private final Player[] players = new Player[GuessNumberTest.COUNT];
    private int secretNum;

    public GuessNumber(String[] names) {
        for (int i = 0; i < GuessNumberTest.COUNT; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void start() {
        Random rnd = new Random();
        for (int i = 1; i <= ROUNDS; i++) {
            System.out.println("Раунд " + i);
            shufflePlayers(rnd);
            secretNum = generateSecretNum(rnd);
            playRound();
        }
        determineWinner();
        clearScores();
    }

    private void shufflePlayers(Random rnd) {
        for (int i = GuessNumberTest.COUNT - 1; i > 0 ; i--) {
            int position = rnd.nextInt(i + 1);
            Player temp = players[i];
            players[i] = players[position];
            players[position] = temp;
        }
    }

    private int generateSecretNum(Random rnd) {
        return rnd.nextInt(MIN, MAX + 1);
    }

    private void playRound() {
        boolean isWin = false;
        for (int i = 0; i < ATTEMPTS_LIMIT; i++) {
            for (Player player : players) {
                inputPlayerNumber(player);
                if (isGuessed(player)) {
                    player.addScore();
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }
        if (!isWin) {
            System.out.println("Никто не угадал");
        }
        printPlayersAttempts();
        clear();
    }

    private void inputPlayerNumber(Player player) {
        Scanner console = new Scanner(System.in);
        System.out.print("Игрок " + player.getName() + ", введите число: ");

        boolean continueInput = true;
        do {
            try {
                while (!player.addNum(console.nextInt())) {
                    System.out.print("Число не входит в полуинтервал (" + MIN + ", " + MAX + "]. Введите число: ");
                }
                continueInput = false;
            } catch (InputMismatchException exception) {
                System.out.print("Некорректный формат целого числа. Введите число: ");
                console.nextLine();
            }
        } while (continueInput);
    }

    private boolean isGuessed(Player player) {
        boolean isEqual = checkNum(player);
        if (!isEqual && player.getAttempt() == ATTEMPTS_LIMIT) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return isEqual;
    }

    private boolean checkNum(Player player) {
        if (player.getNum() == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNum +
                    " с " + player.getAttempt() + " попытки");
            return true;
        }
        String comparisonSign = (player.getNum() > secretNum) ? "больше" : "меньше";
        System.out.println("Число " + player.getNum() + " " + comparisonSign + " загаданного числа");
        return false;
    }

    private void printPlayersAttempts() {
        for (Player player : players) {
            int[] attempts = player.getNums();
            System.out.print("Попытки игрока " + player.getName() + ": ");
            for (int num : attempts) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private void clear() {
        for (Player player : players) {
            player.clear();
        }
    }

    private void determineWinner() {
        int maxScore = players[0].getScore();
        StringBuilder winner = new StringBuilder(players[0].getName());
        boolean draw = false;

        for (int i = 1; i < GuessNumberTest.COUNT; i++) {
            if (maxScore < players[i].getScore()) {
                maxScore = players[i].getScore();
                winner = new StringBuilder(players[i].getName());
                draw = false;
            } else if (maxScore > 0 && maxScore == players[i].getScore()) {
                winner.append(", ").append(players[i].getName());
                draw = true;
            }
        }
        if (draw) {
            System.out.println("Ничья! Игроки " + winner + " набрали по " + maxScore + " очку");
        } else {
            System.out.println(maxScore > 0 ? "\nПобедил игрок: " + winner : "\nНикто не победил");
        }
    }

    private void clearScores() {
        for (Player player: players) {
            player.clearScore();
        }
    }
}