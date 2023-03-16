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
        System.out.print("Исходное число в обратном порядке: ");
        while (srcNum > 0) {
            int currentNum = srcNum % 10;
            System.out.printf("%d", currentNum);
            sum += currentNum;
            srcNum /= 10;
        }
        System.out.printf("\nСумма цифр: %d\n", sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        counter = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%4d", i);
            counter++;

            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
        if (counter != 0) {
            int zeros = 5 - counter;
            for (int i = 0; i < zeros; i++) {
                System.out.printf("%4d", 0);
            }
        }
        System.out.println();

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
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
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // прямоугольный треугольник
        int lineCount = 5;
 
        while(lineCount > 0){
            int symbolCount = lineCount;
            while(symbolCount > 0){
                System.out.print("#");
                symbolCount--;
            }
            System.out.println();
            lineCount--;
        }
        System.out.println();

        // равносторонний треугольник
        lineCount = 1;
        do {
            int symbolCount = 0;
            if (lineCount == 4) {
                symbolCount = 2;
            } else if (lineCount == 5) {
                symbolCount = 4;
            }             
            do {
                System.out.print("$");
                symbolCount++;
                
            } while (symbolCount < lineCount);
            System.out.println();

            lineCount++;
        } while ( lineCount <= 5);
        System.out.println();

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
        int reverseNum = 0;
        int copySrcNum = srcNum;

        while (copySrcNum != 0) {
            reverseNum = reverseNum * 10 + copySrcNum % 10;
            copySrcNum /= 10;
        }
        if (srcNum == reverseNum) {
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
        System.out.print("----------------------------");
        lineCount = 2;
        while (lineCount < 10) {
            System.out.printf("\n %d |", lineCount);
            int columnCount = 2;
            while (columnCount < 10) {
                System.out.printf("%3d", lineCount * columnCount);
                columnCount++;
            }
            lineCount++;
        }
    }
}