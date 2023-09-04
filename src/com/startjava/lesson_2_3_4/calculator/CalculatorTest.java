package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = scan.nextLine();
                try {
                    double result = Calculator.calculate(mathExpression);
                    printResult(mathExpression, result);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scan.nextLine();
        } while (!answer.equals("no"));

        System.out.println("Калькулятор закрылся");
        scan.close();
    }

    private static void printResult(String mathExpression, double result) {
        System.out.printf("%s = %" + (result % 1 == 0 ? ".0" : ".3") + "f%n", mathExpression, result);
    }
}