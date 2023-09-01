package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static Player player1;
    private static Player player2;
    private static Player player3;

    public static void main(String[] args) {
        System.out.println("Игра началась!");
        createPlayers();

        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                GuessNumber game = new GuessNumber(player1, player2, player3);
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scan.nextLine();
        } while (!answer.equals("no"));

        System.out.println("Игра завершена!");
        scan.close();
    }

    public static void createPlayers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имена игроков");

        System.out.print("Игрок 1: ");
        player1 = new Player(scan.nextLine());
        System.out.print("Игрок 2: ");
        player2 = new Player(scan.nextLine());
        System.out.print("Игрок 3: ");
        player3 = new Player(scan.nextLine());
    }
}