package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(Scanner scan) {
        Random rnd = new Random();
        int secretNumber = rnd.nextInt(100 + 1);
        int playerNumber;

        player1.refreshAttempts();
        player2.refreshAttempts();

        Player currentPlayer = player1;

        System.out.println("У каждого игрока по " + Player.MAX_ATTEMPTS_COUNT + " попыток");

        do {
            if (currentPlayer.getAttemptsCount() < Player.MAX_ATTEMPTS_COUNT) {
                System.out.print("Игрок " + currentPlayer.getName() + ", введите число: ");
                playerNumber = scan.nextInt();
                scan.nextLine();
                currentPlayer.setPlayerNumber(playerNumber);
                currentPlayer.addAttempts();

                if (playerNumber == secretNumber) {
                    System.out.println("Игрок " + currentPlayer.getName() + " угадал число " + secretNumber +
                            " с " + currentPlayer.getAttemptsCount() + " попытки");
                    break;
                }

                if (playerNumber > secretNumber) {
                    System.out.println("Число " + playerNumber + " больше загаданного числа");
                } else {
                    System.out.println("Число " + playerNumber + " меньше загаданного числа");
                }
            }
            if (currentPlayer.getAttemptsCount() == Player.MAX_ATTEMPTS_COUNT) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            }

            // Смена игрока
            currentPlayer = currentPlayer == player1 ? player2 : player1;
        } while (currentPlayer.getAttemptsCount() < Player.MAX_ATTEMPTS_COUNT);

        if (!(player1.getNumber() == secretNumber) && !(player2.getNumber() == secretNumber)) {
            System.out.println("Никто не угадал");
        }

        player1.printAttempts();
        player2.printAttempts();
    }
}