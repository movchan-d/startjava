package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = scan.nextLine();
                printResult(Calculator.calculate(mathExpression));
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scan.nextLine();
        } while (!answer.equals("no"));

        System.out.println("Калькулятор закрылся");
        scan.close();
    }

    private static void printResult(double result) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String formattedResult = (decimalFormat.format(result).endsWith(".000")) ?
                String.valueOf((int) result) : decimalFormat.format(result);
        System.out.println("Результат: " + formattedResult);
    }
}