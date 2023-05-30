package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    static int len;

    public static void main(String[] args) {
        reverseArray();
        multiplyArrayElements();
        deleteArrayElements();
        reverseLadderArray();
        generateUniqueNumbersArray();
        copyNonEmptyLines();
    }

    private static void reverseArray() {
        System.out.println("1. Реверс значений массива");
        int[] numbers = {5, 3, 2, 6, 7, 1, 4};
        len = numbers.length;
        // до модификации
        printIntArray(numbers);

        // перестановка значений в обратном порядке
        for (int i = 0; i < len / 2; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[--len];
            numbers[len] = tmp;
        }
        // отображение массива после модификации
        printIntArray(numbers);
    }

    private static void multiplyArrayElements() {
        System.out.println("\n2. Вывод произведения элементов массива");

        int[] multipliers = new int[10];
        len = multipliers.length;
        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
        }

        int prod = 1;
        for (int i = 1; i < len - 1; i++) {
            prod *= multipliers[i];
            System.out.print(multipliers[i] + (i < len - 2 ? " * " : " = " + prod));
        }
        System.out.println("\nЭлемент массива " + multipliers[0] + " имеет индекс " + 0);
        System.out.println("Элемент массива " + multipliers[len - 1] + " имеет индекс " + (len - 1));
    }

    private static void deleteArrayElements() {
        System.out.println("\n3. Удаление элементов массива");

        // Заполнение массива случайными вещественными числами
        float[] rndFloats = new float[15];
        len = rndFloats.length;
        for (int i = 0; i < len; i++) {
            rndFloats[i] = (float) Math.random();
        }
        System.out.println("Исходный массив:");
        printFloatArray(rndFloats);

        // Перезапись элементов массива
        float middleCellElement = rndFloats[len / 2];
        int countChangedElements = 0;
        for (int i = 0; i < len; i++) {
            if (rndFloats[i] > middleCellElement) {
                rndFloats[i] = 0;
                countChangedElements++;
            }
        }
        System.out.println("Измененный массив:");
        printFloatArray(rndFloats);
        System.out.println("Количество обнуленных элементов: " + countChangedElements);
    }

    private static void reverseLadderArray() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");

        // Создание и заполнение массива
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        // Вывод элементов массива лесенкой в обратном порядке
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    private static void generateUniqueNumbersArray() {
        System.out.println("\n5. Генерация уникальных чисел");

        int[] uniqueInts = new int[30];
        len = uniqueInts.length;

        // Заполнение массива случайными уникальными числами
        int index = 0;
        while (index < len){
            int num = (int)(Math.random() * 40 + 60);
            if (isUnique(uniqueInts, num)){
                uniqueInts[index++] = num;
            }
        }

        // Печать отсортированного массива
        Arrays.sort(uniqueInts);
        for (int i = 0; i < uniqueInts.length; i++) {
            System.out.print(uniqueInts[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static void copyNonEmptyLines() {
        System.out.println("\n6. Копирование не пустых строк");

        String[] strings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        // вычисляем количество непустых строк и создаем второй массив
        int count = 0;
        for (String s : strings) {
            if (!s.trim().isBlank()) {
                count++;
            }
        }
        String[] nonEmptyStrings = new String[count];

        // копируем непустые последовательности из первого массива во второй
        int index = 0;
        int start = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].trim().isBlank()) {
                if (start != i) {
                    System.arraycopy(strings, start, nonEmptyStrings, index, i - start);
                    index += i - start;
                }
                start = i + 1;
            }
        }
        if (start != strings.length) {
            System.arraycopy(strings, start, nonEmptyStrings, index, strings.length - start);
        }
        // выводим оба массива на экран
        System.out.println("Исходный массив: " + Arrays.toString(strings));
        System.out.println("Массив без пустых строк: " + Arrays.toString(nonEmptyStrings));
    }

    private static void printFloatArray(float[] floats) {
        len = floats.length;
        for (int i = 0; i < len; i++) {
            System.out.printf("%7.3f", floats[i]);
            if (i == len / 2) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static boolean isUnique(int[] ints, int num) {
        for (int currentNum : ints) {
            if (currentNum == num) {
                return false;
            }
        }
        return true;
    }

    private static void printIntArray(int[] ints) {
        for (int num: ints) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
