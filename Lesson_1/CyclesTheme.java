public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int currentNumber = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (currentNumber % 2 == 0) {
                sumEven += currentNumber;
            } else {
                sumOdd += currentNumber;
            }
            currentNumber++;
        } while(currentNumber <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven +
                ",а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.printf("%d", i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sum = 0;
        int trgNum = 0;
        System.out.println("Исходное число: " + srcNum);
        System.out.printf("Исходное число в обратном порядке: ");
        int divider = 1;
        while (divider < 1001) {
            trgNum = (srcNum / divider) % 10;
            sum += trgNum;
            System.out.printf("%d", trgNum);
            divider *= 10;
        }
        System.out.printf("\nСумма цифр: %d\n", sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        srcNum = 1;
        for (int i = 1; i < 24; i+=2) {
            if (srcNum % 5 == 0) {
                System.out.printf("%4d\n", i);
                srcNum = 0;
            } else {
                System.out.printf("%4d", i);
            }
            srcNum++;
        }
        if ((srcNum - 1) != 0) {
            while (srcNum < 6) {
                System.out.printf("%4d", 0);
                srcNum++;
            }
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        srcNum = 3242592;
        int numTwo = 0;
        int currentDigit = 1;
        divider = 1;
        while (currentDigit < 8) {
            trgNum = (srcNum / divider) % 10;
            if (trgNum == 2) {
                numTwo++;
            }
            divider *= 10;
            currentDigit++;
        }
        if (numTwo % 2 == 0) {
            System.out.printf("число %d содержит %d (%s) количество двоек\n", srcNum, numTwo,
                    "четное");
        } else {
            System.out.printf("число %d содержит %d (%s) количество двоек\n", srcNum, numTwo,
                    "нечетное");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        // прямоугольник
        for (int i = 1; i < 6 ; i++) {
            for (int j = 1; j < 10 ; j++) {
                System.out.printf("%s", "*");
            }
            System.out.printf("%s%n", "*");
        }
        // прямоугольный треугольник
        int x = 5;
        int y = 0;
        while (x > 0) {
            y = x - 1;
            while (y > 0) {
                System.out.printf("%s", "#");
                y--;
            }
            System.out.printf("%s\n", "#");
            x--;
        }
        // равносторонний треугольник
        x = 1;
        do {
            y = 1;
            while (y < x) {
                System.out.printf("%s", "$");
                y++;
            }
            System.out.printf("%s\n", "$");
            x++;
        } while(x < 4);
        x = 1;
        do {
            y = 2;
            while (y > x) {
                System.out.printf("%s", "$");
                y--;
            }
            System.out.printf("%s\n", "$");
            x++;
        } while (x < 3);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%8s%8s %n", "Dec", "Char");
        for (int i = 0; i < 128; i++) {
            if (i < 48 & i % 2 != 0) {
                System.out.printf("%8d%8s%n", i, (char) i);
            } else if ( i > 96 & i < 123 & i % 2 == 0) {
                System.out.printf("%8d%8s%n", i, (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1_234_321;
        currentDigit = 1;
        divider = 1;
        int multiplier = 1_000_000;

        while (currentDigit < 8) {
            trgNum += ((srcNum / divider) % 10) * multiplier;
            divider *= 10;
            multiplier /= 10;
            currentDigit++;
        }
        if (srcNum == trgNum) {
            System.out.printf("Число %d является палиндромом\n", srcNum);
        } else {
            System.out.printf("Число %d не является палиндромом\n", srcNum);
        }


        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 135234;
        int sum1 = 0;
        int sum2 = 0;
        currentDigit = 1;
        divider = 1;
        for (int i = 1; i < 7; i++) {
            trgNum = (srcNum / divider) % 10;
            if (i < 4) {
                sum2 += trgNum;
            } else {
                sum1 += trgNum;
            }
            divider *= 10;
        }
        if (sum1 == sum2) {
            System.out.printf("Число %d является счастливым\n", srcNum);
        } else {
            System.out.printf("Число %d не является счастливым\n", srcNum);
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("\t" + "ТАБЛИЦА ПИФАГОРА\n");
        System.out.printf("   |%3s %2s %2s %2s %2s %2s %2s %2s%n", "2","3","4","5","6","7","8","9");
        System.out.printf("----------------------------");
        y = 2;
        while (y < 10) {
            System.out.printf("\n %d |", y);
            
            x = 2;
            while (x < 10) {
                System.out.printf("%3d", y * x);
                x++;
            }
            y++;
        }
    }
}