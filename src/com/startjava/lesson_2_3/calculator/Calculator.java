package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public int getResult(int firstNumber, int secondNumber, char sign) {
        int result = 0;
        switch(sign) {
            case '+' :
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*' :
                result = firstNumber * secondNumber;
                break;
            case '/' :
                result = firstNumber / secondNumber;
                break;
            case '%' :
                result = firstNumber % secondNumber;
                break;
            case '^' :
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                break;
        }
        return result;
    }
    
    public boolean isSignCorrect(char sign) {
        boolean isSignCorrect = true;
        if (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '%' && sign != '^') {
            isSignCorrect = false;
        }
        return isSignCorrect;
    }
}