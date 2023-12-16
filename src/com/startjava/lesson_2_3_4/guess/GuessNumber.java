package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    static final int MAX_ATTEMPTS_LIMIT = 3;
    static final int ROUNDS = 3;
    private final Player[] players = new Player[GuessNumberTest.COUNT];
    private int secretNum;

    public GuessNumber(String[] names) {
        for (int i = 0; i < GuessNumberTest.COUNT; i++) {
            players[i] = new Player(names[i]);
        }
    }

    public void start() {
        for (int i = 1; i <= ROUNDS; i++) {
            System.out.println("Раунд " + i);
            shufflePlayers(players);
            secretNum = generateSecretNum();
            playRound();
        }
        determineWinner();
        clearScores();
    }

    private void shufflePlayers(Player[] players) {
        Random random = new Random();
        for (int i = players.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Player temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
    }

    private int generateSecretNum() {
        Random rnd = new Random();
        return rnd.nextInt(100 + 1);
    }

    private void playRound() {
        boolean isWin = false;
        for (int i = 0; i < MAX_ATTEMPTS_LIMIT; i++) {
            for (Player player: players) {
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
                    System.out.print("Число не входит в полуинтервал (0, 100]. Введите число: ");
                }
                continueInput = false;
            } catch (InputMismatchException exception) {
                System.out.print("Некорректный формат целого числа. Введите число: ");
                console.nextLine();
            }
        } while (continueInput);
    }

    private boolean isGuessed(Player player) {
        if (player.getNum() == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNum +
                    " с " + player.getAttempt() + " попытки");
            return true;
        }
        String comparisonSign = (player.getNum() > secretNum) ? "больше" : "меньше";
        System.out.println("Число " + player.getNum() + " " + comparisonSign + " загаданного числа");
        if (player.getAttempt() == MAX_ATTEMPTS_LIMIT) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void clear() {
        for (Player player: players) {
            player.clear();
        }
    }

    private void printPlayersAttempts() {
        for (Player player: players ) {
            int[] attempts = Arrays.copyOf(player.getNums(), player.getAttempt());
            System.out.print("Попытки игрока " + player.getName() + ": ");
            for (int num: attempts) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private void determineWinner() {
        int maxScore = players[0].getScore();
        String winner = players[0].getName();

        for (int i = 1; i < GuessNumberTest.COUNT; i++) {
            if (maxScore < players[i].getScore()) {
                maxScore = players[i].getScore();
                winner = players[i].getName();
            }
        }
        System.out.println(maxScore > 0 ? "\nПобедил игрок: " + winner : "\nНикто не победил");
    }

    private void clearScores() {
        for (Player player: players) {
            player.clearScore();
        }
    }
}