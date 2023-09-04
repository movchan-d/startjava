package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String mathExpression) {
        // Конвертация строки в математическое выражение
        String[] elements = mathExpression.split(" ");

        // Проверка длины выражения
        checkLength(elements);

        // Определение элементов выражения
        int number1 = getIntNumber(elements[0]);
        int number2 = getIntNumber(elements[2]);
        char sign = elements[1].charAt(0);

        // Вычисление результата
        return switch (sign) {
            case '+' -> Math.addExact(number1, number2);
            case '-' -> Math.subtractExact(number1, number2);
            case '*' -> Math.multiplyExact(number1, number2);
            case '/' -> (double) number1 / (double) number2;
            case '%' -> number1 % number2;
            case '^' -> Math.pow(number1, number2);
            default -> throw new RuntimeException("Некорректный оператор: " + sign);
        };
    }

    private static void checkLength(String[] elements) {
        if (elements.length != 3) {
            throw new RuntimeException("Некорректное выражение, должно быть три элемента");
        }
    }

    private static int getIntNumber(String number) {
        int intNumber;
        try {
            intNumber = Integer.parseInt(number);
        } catch (RuntimeException e) {
            throw new RuntimeException("Некорректный формат целого числа: " + number);
        }
        if (intNumber <= 0) {
            throw new RuntimeException("Число должно быть положительным: " + number);
        }
        return intNumber;
    }
}