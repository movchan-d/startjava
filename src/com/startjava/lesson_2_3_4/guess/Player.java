package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_COUNT_ATTEMPTS = 10;
    private final String name;
    private final int[] numbers = new int[MAX_COUNT_ATTEMPTS];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public void refreshAttempts() {
        for (int i = 0; i < countAttempts; i++) {
            Arrays.fill(numbers, i, i + 1, 0);
        }
        countAttempts = 0;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public String getName() {
        return name;
    }

    public void setPlayerNumber(int number) {
        countAttempts++;
        numbers[countAttempts - 1] = number;
    }

    public int getNumber() {
        return numbers[countAttempts - 1];
    }

    public void printAttempts() {
        int[] attempts = Arrays.copyOf(numbers, countAttempts);
        System.out.print("Попытки игрока " + name + ": ");
        for (int num: attempts) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}