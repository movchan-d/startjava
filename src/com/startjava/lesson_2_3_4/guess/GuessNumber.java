package com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player[] players = new Player[3];

    public GuessNumber(Player... players) {
        int i = 0;
        for (Player player: players ) {
            this.players[i] = player;
            i++;
        }
    }

    public void start() {
        int roundCounts = 1;

        shufflePlayers(players);
        do {
            System.out.println("Раунд " + roundCounts);
            System.out.println("У каждого игрока по " + Player.MAX_ATTEMPTS_COUNT + " попытки(ок)");

            playRound();
            printPlayersAttempts();
            roundCounts++;
        } while (roundCounts < 4);
    }

    private void playRound() {
        int secretNumber = generateSecretNumber();

        for (Player player: players) {
            player.refreshAttempts();
        }

        boolean isContinued = true;
        do {
            for (Player player: players) {
                if (player.getAttemptsCount() < Player.MAX_ATTEMPTS_COUNT ) {
                    inputPlayerNumber(player);
                    if (player.getNumber() == secretNumber) {
                        System.out.println("Игрок " + player.getName() + " угадал число " + secretNumber +
                                " с " + player.getAttemptsCount() + " попытки");
                        isContinued = false;
                        break;
                    }
                    String comparisonSign = (player.getNumber() > secretNumber) ? "больше" : "меньше";
                    System.out.println("Число " + player.getNumber() + " " + comparisonSign + " загаданного числа");
                }
                if (player.getAttemptsCount() == Player.MAX_ATTEMPTS_COUNT) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                    isContinued = false;
                }
            }
        } while(isContinued);

        if (!(players[0].getNumber() == secretNumber) &&
            !(players[1].getNumber() == secretNumber) &&
            !(players[2].getNumber() == secretNumber)) {
            System.out.println("Никто не угадал");
        }
    }

    private int generateSecretNumber() {
        Random rnd = new Random();
        return rnd.nextInt(100 + 1);
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

    private void inputPlayerNumber(Player player) {
        int playerNumber;

        Scanner scan = new Scanner(System.in);
        System.out.print("Игрок " + player.getName() + ", введите число: ");

        boolean continueInput = true;
        do {
            try {
                playerNumber = scan.nextInt();
                scan.nextLine();
                if (playerNumber <= 0 || playerNumber > 100) {
                    System.out.print("Число " + playerNumber + " не входит в полуинтервал (0, 100]. " +
                            "Введите число: ");
                } else {
                    player.setPlayerNumber(playerNumber);
                    continueInput = false;
                }
            } catch (InputMismatchException exception) {
                System.out.print("Некорректный формат целого числа. Введите число: ");
                scan.nextLine();
            }
        } while (continueInput);
    }

    private void printPlayersAttempts() {
        for (Player player: players ) {
            player.printAttempts();
        }
    }
}