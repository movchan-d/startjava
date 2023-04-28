package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\nЗанятие1. Урок 6. Переменные: примитивные типы данных");

        System.out.println("\n1. Вывод значений переменных на консоль");
        byte sysBit = 64;
        short sysRelease = 11;
        int ram = 8;
        long hdd = 500;
        float monitorDigonal = 23.8f;
        double cpuFrequency = 1.99d;
        char sysLang = 'R';
        boolean sensory = true;
        System.out.println("Разряд ОС (бит): " + sysBit);
        System.out.println("Выпуск Windows: " + sysRelease);
        System.out.println("RAM: " + ram);
        System.out.println("HDD: " + hdd);
        System.out.println("Диагональ монитора: " + monitorDigonal);
        System.out.println("Частота процессора: " + cpuFrequency);
        System.out.println("Язык системы: " + sysLang);
        System.out.println("Сенсорный ввод: " + sensory);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float penPrice = 100;
        float bookPrice = 200;
        float discountPercent = 11;
        float totalPrice = penPrice + bookPrice;
        float discount = totalPrice * discountPercent / 100;
        float discountPrice = totalPrice - discount;
        System.out.println("Стоимость: " + totalPrice);
        System.out.println("Сумма скидки:   " + discount);
        System.out.println("Стоимость со скидкой:" + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;

        System.out.println(maxByte + "\t" + ++maxByte + "\t" + --maxByte + "\n");
        System.out.println(maxShort  + "\t" + ++maxShort + "\t" + ++maxShort + "\n");
        System.out.println(maxInt  + "\t" + ++maxInt + "\t" + --maxInt + "\n");
        System.out.println(maxLong  + "\t" + ++maxLong + "\t" + --maxLong + "\n");

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c = b;
        // с помощью третьей переменной
        System.out.println("5.1 C помощью третьей переменной");
        System.out.println("исходные значения переменных:\n" + "a = " + a + "\n"+ "b = " + b);
        b = a;
        a = c;
        System.out.println("новые значения переменных:\n" + "a = " + a + "\n"+ "b = " + b);
        // с помощью арифметических операций
        System.out.println("5.2 С помощью арифметических операций");
        System.out.println("исходные значения переменных:\n" + "a = " + a + "\n"+ "b = " + b);
        a *= b;
        b = a / b;
        a = a / b;
        System.out.println("новые значения переменных:\n" + "a = " + a + "\n"+ "b = " + b);
        // с помощью побитовой операции ^
        System.out.println("5.3 С помощью побитовой операции ^");
        System.out.println("исходные значения переменных:\n" + "a = " + a + "\n"+ "b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("новые значения переменных:\n" + "a = " + a + "\n"+ "b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char lattice = '#';
        char and = '&';
        char dog = '@';
        char degree = '^';
        char underLine = '_';
        System.out.println("Код    Символ");
        System.out.println((int) lattice + "     " + lattice);
        System.out.println((int) and + "     " + and);
        System.out.println((int) dog + "     " + dog);
        System.out.println((int) degree + "     " + degree);
        System.out.println((int) underLine + "     " + underLine);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlach = '\\';
        char leftBracket = '(';
        char rightBracket = ')';
        char uLine = '_';
        System.out.println("    " + slash + backSlach );
        System.out.println("   " + slash + "  " + backSlach );
        System.out.println("  " + slash + uLine + leftBracket + " " + rightBracket + backSlach );
        System.out.println(" " + slash + "      " + backSlach );
        System.out.println(""  + slash + uLine + uLine + uLine + uLine + slash + backSlach + uLine +
                uLine + backSlach);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;
        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;
        System.out.println("Число " + num + " содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(tens + " десятков");
        System.out.println(ones + " единиц");
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + product);

        System.out.println("\n9. Вывод времени");
        int time = 86399;
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds + "\n");
    }
}