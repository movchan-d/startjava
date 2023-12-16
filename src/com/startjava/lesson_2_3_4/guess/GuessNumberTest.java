package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    static final int COUNT = 3;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Игра началась");
        System.out.println("У каждого игрока по " + GuessNumber.MAX_ATTEMPTS_LIMIT + " попытки(ок)");
        String[] names = inputNames(console);

        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                GuessNumber game = new GuessNumber(names);
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = console.nextLine();
        } while (!answer.equals("no"));

        System.out.println("Игра завершена!");
        console.close();
    }

    private static String[] inputNames(Scanner console) {
        String[] names = new String[COUNT];
        for (int i = 0; i < COUNT; i++) {
            System.out.print("Введите имя игрока: ");
            names[i] = console.nextLine();
        }
        return names;
    }
}