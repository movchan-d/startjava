package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String mathExpression) {
        // Конвертируем строки в математическое выражение
        String[] strings = mathExpression.split(" ");
        int firstNumber = Integer.parseInt(strings[0]);
        int secondNumber = Integer.parseInt(strings[2]);
        char sign = strings[1].charAt(0);

        double result = 0;
        switch(sign) {
            case '+' :
                result = Math.addExact(firstNumber, secondNumber);
                break;
            case '-':
                result = Math.subtractExact(firstNumber, secondNumber);
                break;
            case '*' :
                result = Math.multiplyExact(firstNumber, secondNumber);
                break;
            case '/' :
                result = (double) firstNumber / (double) secondNumber;
                break;
            case '%' :
                result = firstNumber % secondNumber;
                break;
            case '^' :
                result = Math.pow(firstNumber, secondNumber);
                break;
        }
        return result;
    }
}