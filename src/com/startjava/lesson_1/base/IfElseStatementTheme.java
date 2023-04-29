package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 17;
        boolean isMale = false;
        float heigh = 1.75f;
        char firstLetter = "Max".charAt(0);

        if (age > 20) {
            System.out.println("Возраст " + age + " больше 20");
        } else {
            System.out.println("Возраст " + age + " меньше 20");
        }

        if (!isMale) {
            System.out.println("Женский");
        } else {
            System.out.println("Мужской");
        }

        if (heigh < 1.80) {
            System.out.println("Рост " + heigh + " меньше 1м 80см");
        } else {
            System.out.println("Рост " + heigh + " больше 1м 80см");
        }

        if (firstLetter == 'M') {
            System.out.println("Первая буква имени: " + firstLetter);
        } else if (firstLetter == 'I') {
            System.out.println("Первая буква имени: " + firstLetter);
        } else {
            System.out.println("Первая буква имени " + firstLetter + " (не M и не I)");
        }

        System.out.println("\n2. Поиск max и min числа");
        float a = 9.81f;
        int b = 10;

        if (a > b) {
            System.out.println("max = " + a);
            System.out.println("min = " + b);
        } else if (a < b) {
            System.out.println("max = " + b);
            System.out.println("min = " + a);
        } else {
            System.out.println("a = b = " + a);
        }

        System.out.println("\n3. Проверка числа");
        int num = -10;

        if (num == 0) {
            System.out.println(num);
        } else {
            if (num % 2 == 0) {
                System.out.println("Число " + num + " четное");
            } else {
                System.out.println("Число " + num + " нечетное");
            }
            if (num > 0) {
                System.out.println("Число " + num + " положительное");
            } else {
                System.out.println("Число " + num + " отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 223;
        int hundreds1 = num1 / 100;
        int tens1 = num2 % 100 / 10;
        int ones1 = num1 % 10;
        int hundreds2 = num2 / 100;
        int tens2 = num2 % 100 / 10;
        int ones2 = num2 % 10;
        System.out.println("Исходные числа:");
        System.out.println(num1 + "\n" + num2);

        if (hundreds1 != hundreds2 && tens1 != tens2 && ones1 != ones2) {
            System.out.println("Все цифры в разрядах разные");
        } else {
            if (hundreds1 == hundreds2) {
                System.out.println("Одинаковая цифра: " + hundreds1 + " (сотни)");
            }
            if (tens1 == tens2) {
                System.out.println("Одинаковая цифра: " + tens1 + " (десятки)");
            }
            if (ones1 == ones2) {
                System.out.println("Одинаковая цифра: " + ones1 + " (единицы)");
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char code = '\u0057';

        if (code >= '0' && code <= '9') {
            System.out.println(code + " - число");
        } else if (code >= 'A' && code <= 'Z') {
            System.out.println( code + " - заглавная буква");
        } else if (code >= 'a' && code <= 'z') {
            System.out.println(code + " - маленькая буква");
        } else {
            System.out.println(code + " - не буква и не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        float deposite = 300_000f;
        float interestRate = 5f;
        if (deposite >= 100_000 && deposite <= 300_000) {
            interestRate = 7;
        } else if (deposite > 300_000) {
            interestRate = 10;
        }
        float percent = deposite * interestRate / 100;
        System.out.println("Сумма вклада: " + deposite);
        System.out.println("Начисленный %: " +  percent);
        System.out.println("Итоговая сумма с %: " + (deposite + percent));

        System.out.println("\n7. Определение оценки по предметам");
        float rateHistory = 59f;
        int gradeHistory = 5; 
        if (rateHistory <= 60) {
            gradeHistory = 2;
        } else if (rateHistory <= 73) {
            gradeHistory = 3;
        } else if (rateHistory <= 91) {
            gradeHistory = 4;
        }

        float rateProgramming = 91f;
        int gradeProgramming = 5;
        if (rateProgramming <= 60) {
            gradeProgramming  = 2;
        } else if (rateProgramming <= 73) {
            gradeProgramming  = 3;
        } else if (rateProgramming <= 91) {
            gradeProgramming  = 4;
        }

        float averageGrade = (gradeHistory + gradeProgramming) / 2;
        float averageRate  = (rateHistory + rateProgramming) / 2;
        System.out.println(gradeHistory + " - история");
        System.out.println(gradeProgramming + " - программирование");
        System.out.println(averageGrade + " - средний балл");
        System.out.println(averageRate + " - средний % по предметам");

        System.out.println("\n8. Расчет прибыли за год");
        float rentPrice = 5_000f;
        float costPrice = 9_000f;
        float monthIncome = 13_000f;
        float yearProfit = (monthIncome - costPrice - rentPrice) * 12;
        if (yearProfit > 0) {
            System.out.println("прибыль за год: +" + yearProfit + " руб.");
        } else {
            System.out.println("прибыль за год: " + yearProfit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int numBank100 = 10;
        int numBank10 = 5;
        int numBank1 = 50;
        int sumBank = 100 * numBank100 + 10 * numBank10 + 1 * numBank1;
        int sumInput = 567;
        if (sumBank < sumInput) {
            System.out.println("Недостаточно средств в банкомате");
        } else {
            int numOutput100 = sumInput / 100;
            if (numOutput100 > numBank100) {
                numOutput100 = numBank100;
            }
            int rest = sumInput;
            rest -= (100 * numOutput100);
            int numOutput10 = rest / 10;
            if (numOutput10 > numBank10) {
                numOutput10 = numBank10;
            }
            rest -= (numOutput10 * 10);
            int numOutput1 = rest;
            if (numOutput1 > numBank1) {
                numOutput1 = numBank1;
            }
            int sumOut = 100 * numOutput100 + 10 * numOutput10 + 1 * numOutput1;
            System.out.println("Запрашиваемая сумма: " + sumInput);
            System.out.println("Номиналы в наличие: 100, 10, 1");
            System.out.println("Выдача: ");
            System.out.println(numOutput100 + " купюр номиналом 100");
            System.out.println(numOutput10  + " купюр номиналом 10");
            System.out.println(numOutput1   + " купюр номиналом 1");
            System.out.println("Выдаваемая сумма:" + sumOut);
        }
    }
}