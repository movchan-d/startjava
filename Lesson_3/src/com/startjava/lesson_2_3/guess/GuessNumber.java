package com.startjava.lesson_2_3.guess;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(Scanner scan) {
        Random rnd = new Random();
        int secretNumber = rnd.nextInt(100 + 1);
        int playerNumber;
        Player currentPlayer = player1;

        do {
            System.out.print("Игрок " + currentPlayer.getName() + ", введите число: ");
            playerNumber = scan.nextInt();

            if (playerNumber == secretNumber) {
                break;
            }

            if (playerNumber > secretNumber) {
                System.out.println("Число " + playerNumber + " больше загаданного числа");
            } else {
                System.out.println("Число " + playerNumber  + " меньше загаданного числа");
            }
            // Смена игрока
            currentPlayer = currentPlayer == player1 ? player2 : player1;
        } while (true);
        
        System.out.println("Верно! Игрок " + currentPlayer.getName() + " победил!");
    }
}