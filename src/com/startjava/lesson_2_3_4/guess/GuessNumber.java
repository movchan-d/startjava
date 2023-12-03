package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static final int MAX_ATTEMPTS_COUNT = 3;
    private final Player[] players = new Player[GuessNumberTest.COUNT];

    public GuessNumber(String[] names) {
        int i = 0;
        for (String name: names) {
            players[i] = new Player(name);
            i++;
        }
    }

    public void start() {
        int roundCounts = 1;

        shufflePlayers(players);
        do {
            System.out.println("Раунд " + roundCounts);
            System.out.println("У каждого игрока по " + MAX_ATTEMPTS_COUNT + " попытки(ок)");

            playRound();
            printPlayersAttempts();
            roundCounts++;
        } while (roundCounts < 4);
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

    private void playRound() {
        int secretNum = generateSecretNumber();

        for (Player player: players) {
            player.refreshAttempts();
        }

        boolean isContinued = true;
        do {
            for (Player player: players) {
                if (player.getAttempt() < MAX_ATTEMPTS_COUNT ) {
                    inputPlayerNumber(player);
                    if (player.getNum() == secretNum) {
                        System.out.println("Игрок " + player.getName() + " угадал число " + secretNum +
                                " с " + player.getAttempt() + " попытки");
                        isContinued = false;
                        break;
                    }
                    String comparisonSign = (player.getNum() > secretNum) ? "больше" : "меньше";
                    System.out.println("Число " + player.getNum() + " " + comparisonSign + " загаданного числа");
                }
                if (player.getAttempt() == MAX_ATTEMPTS_COUNT) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                    isContinued = false;
                }
            }
        } while(isContinued);

        if (!(players[0].getNum() == secretNum) &&
                !(players[1].getNum() == secretNum) &&
                !(players[2].getNum() == secretNum)) {
            System.out.println("Никто не угадал");
        }
    }

    private int generateSecretNumber() {
        Random rnd = new Random();
        return rnd.nextInt(100 + 1);
    }

    private void inputPlayerNumber(Player player) {
        int playerNumber;

        Scanner console = new Scanner(System.in);
        System.out.print("Игрок " + player.getName() + ", введите число: ");

        boolean continueInput = true;
        do {
            try {
                playerNumber = console.nextInt();
                console.nextLine();
                if (playerNumber <= 0 || playerNumber > 100) {
                    System.out.print("Число " + playerNumber + " не входит в полуинтервал (0, 100]. " +
                            "Введите число: ");
                } else {
                    player.addNumber(playerNumber);
                    continueInput = false;
                }
            } catch (InputMismatchException exception) {
                System.out.print("Некорректный формат целого числа. Введите число: ");
                console.nextLine();
            }
        } while (continueInput);
    }

    private void printPlayersAttempts() {
        for (Player player: players ) {
            int[] attempts = Arrays.copyOf(player.getNumbers(), player.getAttempt());
            System.out.print("Попытки игрока " + player.getName() + ": ");
            for (int num: attempts) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}