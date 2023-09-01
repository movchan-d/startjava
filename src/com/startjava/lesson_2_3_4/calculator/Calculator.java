package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String mathExpression) {
        // Конвертируем строки в математическое выражение
        String[] partsExpression = mathExpression.split(" ");
        double result = 0;

        try {
            int number1 = Integer.parseInt(partsExpression[0]);
            int number2 = Integer.parseInt(partsExpression[2]);
            char sign = partsExpression[1].charAt(0);

            if (number1 <= 0 || number2 <=0) {
                throw new RuntimeException("Числа должны быть положительными");
            }
            return switch (sign) {
                case '+' -> Math.addExact(number1, number2);
                case '-' -> Math.subtractExact(number1, number2);
                case '*' -> Math.multiplyExact(number1, number2);
                case '/' -> (double) number1 / (double) number2;
                case '%' -> number1 % number2;
                case '^' -> Math.pow(number1, number2);
                default -> throw new RuntimeException("Некорректный оператор");
            };
        } catch (NumberFormatException e) {
            System.out.println("Некорректный формат целого числа");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}