package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] nums = new int[GuessNumber.MAX_ATTEMPTS_LIMIT];
    private int attempt;
    private int score;

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
        return nums[attempt - 1];
    }

    public int getScore() {
        return score;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public boolean addNum(int num) {
        if (num <= 0 || num > 100) {
            return false;
        }
        nums[attempt++] = num;
        return true;
    }

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }

    public void addScore() {
        score++;
    }

    public void clearScore() {
        score = 0;
    }
}