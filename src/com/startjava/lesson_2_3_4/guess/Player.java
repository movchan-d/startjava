package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_ATTEMPTS_COUNT = 10;
    private final String name;
    private final int[] numbers = new int[MAX_ATTEMPTS_COUNT];
    private int attemptsCount;

    public Player(String name) {
        this.name = name;
    }

    public void refreshAttempts() {
        for (int i = 0; i < attemptsCount; i++) {
            Arrays.fill(numbers, i, i + 1, 0);
        }
        attemptsCount = 0;
    }

    public int getAttemptsCount() {
        return attemptsCount;
    }

    public String getName() {
        return name;
    }

    public void setPlayerNumber(int number) {
        attemptsCount++;
        numbers[attemptsCount - 1] = number;
    }

    public int getNumber() {
        return numbers[attemptsCount - 1];
    }

    public void printAttempts() {
        int[] attempts = Arrays.copyOf(numbers, attemptsCount);
        System.out.print("Попытки игрока " + name + ": ");
        for (int num: attempts) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}