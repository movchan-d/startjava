package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private int attempt;
    private final int[] numbers = new int[GuessNumber.MAX_ATTEMPTS_COUNT];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public int getNum() {
        return numbers[attempt - 1];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void addNumber(int number) {
        numbers[attempt] = number;
        attempt++;
    }

    public void refreshAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}