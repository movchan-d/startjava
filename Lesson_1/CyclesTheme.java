public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while(counter <= 21);
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
        System.out.println("Исходное число: " + srcNum);
        System.out.printf("Исходное число в обратном порядке: ");
        while (srcNum > 0) {
            System.out.printf("%d", srcNum % 10);
            sum += srcNum % 10;
            srcNum /= 10;
        }
        System.out.printf("\nСумма цифр: %d\n", sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        counter = 1;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%4d", i);
            if (counter % 5 == 0) {
                System.out.printf("%n");
                counter = 0;
            }
            counter++;
        }
        if (counter > 0) {
            while (counter < 6) {
                System.out.printf("%4d", 0);
                counter++;
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        srcNum = 3242592;
        int countTwos = 0;
        System.out.printf("Число %d содержит ", srcNum);
        while (srcNum > 0) {
            if (srcNum % 10 == 2) {
                countTwos++;
            }
            srcNum /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.printf("%d (%s) количество двоек\n", countTwos, "четное");
        } else {
            System.out.printf("%d (%s) количество двоек\n", countTwos, "нечетное");
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
        int multiplier = 1_000_000;
        int trgNum = 0;
        counter = srcNum;
        while (counter > 0) {
            trgNum += (counter % 10) * multiplier;
            counter /= 10;
            multiplier /= 10;
        }
        if (srcNum == trgNum) {
            System.out.printf("Число %d является палиндромом\n", srcNum);
        } else {
            System.out.printf("Число %d не является палиндромом\n", srcNum);
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 135234;
        int firstHalf = srcNum / 1000;
        int secondHalf = srcNum % 1000;
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < 3; i++) {
            int digitFirst = firstHalf % 10;
            int digitSecond = secondHalf % 10;
            firstSum += digitFirst;
            secondSum += digitSecond;
            firstHalf /= 10;
            secondHalf /= 10;
        }
        System.out.printf("Сумма цифр первой половины %d = %d\n", srcNum / 1000, firstSum);
        System.out.printf("Сумма цифр второй половины %d = %d\n", srcNum % 1000, secondSum);
        if (firstSum == secondSum) {
            System.out.println(srcNum + " - это счастливое число!");
        } else {
            System.out.println(srcNum + " - это не счастливое число :(");
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