package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean isKeepDoing = true;
        while (isKeepDoing) {
            System.out.printf("Введите первое число: ");
            int firstNumber = scan.nextInt();
            scan.nextLine();
            char sign = 0;
            boolean isSignIncorrect = true;
            while (isSignIncorrect) {
                System.out.printf("Введите знак математической операции: ");
                sign = scan.nextLine().charAt(0);
                if (calculator.isSignCorrect(sign)) {
                    break;
                } else {
                    System.out.println("Введненая мат.операция не поддерживается.");
                }
            }
            System.out.printf("Введите второе число: ");
            int secondNumber = scan.nextInt();

            int result = calculator.getResult(firstNumber, secondNumber, sign);
            System.out.println("Результат: " + result);

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            scan.nextLine();
            String answer = scan.nextLine();
            switch (answer) {
                case "yes":
                    break;
                case "no" :
                    isKeepDoing= false;
                    break;
                default:
                    Boolean isNotCorrect = true;
                    while (isNotCorrect) {
                        System.out.printf("Некорректный ответ. Хотите продолжить вычисления? [yes/no]: ");
                        String newAnswer = scan.nextLine();
                        switch (newAnswer) {
                            case "yes" :
                                isNotCorrect = false;
                                break;
                            case "no" :
                                isNotCorrect= false;
                                isKeepDoing= false;
                                break;
                        }
                    }
                    break;
            }
        }
        scan.close();
    }
}