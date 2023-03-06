public class CyclesTheme{
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while(i <= 21);

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

        for (i = max - 1; i > min; i--) {
            System.out.printf("%d", i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int numSrc = 1234;
        int sum = 0;

        System.out.println("Исходное число: " + numSrc);
        System.out.printf( "Исходное число в обратном порядке: ");

        i = 1;
        while (i < 5) {
            a = 1;
            int j = 0;
            while (j < i) {
                a *= 10;
                j++;
            }
            b = 1;
            j = 1;
            while (j < i) {
                b *= 10;
                j++;
            }
            sum +=(numSrc % a) / b;
            System.out.printf( "%d", (numSrc % a) / b);
            i++;
        }
        System.out.printf("\nСумма цифр: %d\n", sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int j = 1;
        for (i = 1; i < 24; i+=2) {
            if (j % 5 == 0) {
                System.out.printf("%4d\n", i);
                j = 0;
            } else {
                System.out.printf("%4d", i);
            }
            j++;
        }

        if ((j - 1) != 0) {
            while (j < 6) {
                System.out.printf("%4d", 0);
                j++;
            }
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int num = 3242592;
        int numTwo = 0;
        int remDiv = num;

        i = 7;
        while (i > 0) {
            int k = 1;
            int koef = 1;

            while (k < i) {
                koef *= 10;
                k++;
            }
            if (remDiv / koef == 2) {
                numTwo++;
            }
            remDiv = remDiv % koef;
            i--;
        }

        if (numTwo % 2 == 0) {
            System.out.printf("число %d содержит %d (%s) количество двоек\n", num, numTwo, "четное");
        } else {
            System.out.printf("число %d содержит %d (%s) количество двоек\n", num, numTwo,
                    "нечетное");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        i = 1;
        j = 1;
        // прямоугольник
        for ( i = 1; i < 6 ; i++) {
            for ( j = 1; j < 10 ; j++) {
                System.out.printf("%s", "*");
            }
            System.out.printf("%s%n", "*");
        }
        // прямоугольный треугольник
        i = 5;
        while (i > 0) {
            j = i - 1;
            while (j > 0) {
                System.out.printf("%s", "#");
                j--;
            }
            System.out.printf("%s\n", "#");
            i--;
        }
        // равносторонний треугольник
        i = 1;
        do {
            j = 1;
            while ( j < i) {
                System.out.printf("%s", "$");
                j++;
            }
            System.out.printf("%s\n", "$");
            i++;
        } while(i < 4);

        i = 1;
        do {
            j = 2;
            while (j > i) {
                System.out.printf("%s", "$");
                j--;
            }
            System.out.printf("%s\n", "$");
            i++;
        } while (i < 3);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%8s%8s %n", "Dec", "Char");

        for (char asciiChar = 0; asciiChar < 128 ; asciiChar++) {
            int asciiDec = asciiChar;

            if (asciiDec < 48 & asciiDec % 2 != 0) {
                System.out.printf("%8d%8s%n", asciiDec, asciiChar);
            } else if ( asciiDec > 96 & asciiDec < 123 & asciiDec % 2 == 0) {
                System.out.printf("%8d%8s%n", asciiDec, asciiChar);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        numSrc = 1_234_321;
        int numTrg = 0;
        int numCur = 0;

        for (i = 1; i < 8; i++) {
            a = 1;
            j = 0;
            while (j < i) {
                a *= 10;
                j++;
            }
            b = 1;
            j = 1;
            while (j < i) {
                b *= 10;
                j++;
            }
            numCur = (numSrc % a) / b;
            numTrg = numTrg + numCur * b;
        }

        if (numSrc == numTrg) {
            System.out.printf("Число %d является палиндромом\n", numSrc);
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        numSrc = 135234;
        numCur = 0;
        int numTrg1 = 0;
        int numTrg2 = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (i = 1; i < 7; i++) {
            a = 1;
            j = 0;
            while (j < i) {
                a = a * 10;
                j++;
            }

            b = 1;
            j = 1;
            while (j < i) {
                b = b * 10;
                j++;
            }

            numCur = (numSrc % a) / b;

            if ( i < 4) {
                numTrg2 = numTrg2 + numCur * b;
                sum2 += numCur;
            } else {
                b = b / 1000;
                numTrg1 = numTrg1 + numCur * b;
                sum1 += numCur;
            }
        }

        System.out.printf("Сумма цифр %d = %d\n", numTrg1, sum1);
        System.out.printf("Сумма цифр %d = %d\n", numTrg2, sum2);

        if (sum1 == sum2) {
            System.out.printf("Число %d является счастливым\n", numSrc);
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("\t" + "ТАБЛИЦА ПИФАГОРА\n");
        System.out.printf("   |%3s %2s %2s %2s %2s %2s %2s %2s%n", "2","3","4","5","6","7","8","9");
        System.out.printf("----------------------------");
        
        a = 2;
        while (a < 10) {
            System.out.printf("\n %d |", a);
            
            b = 2;
            while (b < 10) {
                System.out.printf("%3d", a * b);
                b++;
            }
            a++;
        }
    }
}