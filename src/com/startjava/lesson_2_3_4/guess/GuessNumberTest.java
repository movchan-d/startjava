package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Игра началась!");
        System.out.print("Введите имя 1-го игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя 2-го игрока: ");
        Player player2 = new Player(scan.nextLine());

        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                GuessNumber game = new GuessNumber(player1, player2);
                game.start(scan);
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scan.nextLine();
        } while (!answer.equals("no"));

        System.out.println("Игра завершена!");
        scan.close();
    }
}