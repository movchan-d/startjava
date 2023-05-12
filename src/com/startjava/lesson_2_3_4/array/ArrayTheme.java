package com.startjava.lesson_2_3_4.array;

import org.jetbrains.annotations.NotNull;
import java.util.Arrays;
import java.util.Random;

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
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        len = numbers.length;
        // до модификации
        printIntArray(numbers);

        // перестановка значений в обратном порядке
        for (int i = len; i > len / 2; i--) {
            int tempNum = numbers[i - 1];
            numbers[i - 1] = numbers[len - i];
            numbers[len - i] = tempNum;
        }

        // отображение массива после модификации
        printIntArray(numbers);
    }

    private static void multiplyArrayElements() {
        System.out.println("\n2. Вывод произведения элементов массива");

        int[] ints = new int[10];
        len = ints.length;
        for (int i = 0; i < len; i++) {
            ints[i] = i;
        }

        int prod = 1;
        for (int i = 1; i < len - 1; i++) {
            prod *= ints[i];
            System.out.print(ints[i] + (i < len - 2 ? " * " : " = " + prod));
        }
        System.out.println("\nЭлемент массива " + ints[0] + " имеет индекс " + 0);
        System.out.println("Элемент массива " + ints[9] + " имеет индекс " + 9);
    }

    private static void deleteArrayElements() {
        System.out.println("\n3. Удаление элементов массива");

        // Заполнение массива случайными вещественными числами
        float[] floats = new float[15];
        len = floats.length;
        for (int i = 0; i < len; i++) {
            floats[i] = (float) Math.random();
        }
        System.out.println("Исходный массив:");
        printFloatArray(floats);

        // Перезапись элементов массива
        float middleElement = floats[len / 2];
        int countChangedElements = 0;
        for (int i = 0; i < len; i++) {
            if (floats[i] > middleElement) {
                floats[i] = 0;
                countChangedElements++;
            }
        }
        System.out.println("Измененный массив:");
        printFloatArray(floats);
        System.out.println("Количество обнуленных элементов: " + countChangedElements);
    }

    private static void reverseLadderArray() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");

        // Создание и заполнение массива
        char[] chars = new char[26];
        len = chars.length;
        for (int i = 0; i < len; i++) {
            chars[i] = (char) ('A' + i);
        }

        // Вывод элементов массива лесенкой в обратном порядке
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
    }

    private static void generateUniqueNumbersArray() {
        System.out.println("\n5. Генерация уникальных чисел");

        int[] ints = new int[30];
        len = ints.length;
        Random rnd = new Random();
        for (int i = 0; i < len; i++) {
            int num;
            do {
                num = rnd.nextInt(40) + 60;
            } while (isUnique(ints, num));
            ints[i] = num;
        }
        Arrays.sort(ints);
        printIntArray(ints);
    }

    private static void copyNonEmptyLines() {
        System.out.println("\n6. Копирование не пустых строк");

        String[] strings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        String[] nonEmptyStrings = new String[countNonEmptyStrings(strings)];
        len = strings.length;
        int index2 = 0;
        for (int i = 0; i < len; i++) {
            int j = i;
            if (!strings[i].trim().isBlank()) {
                int countNonEmptyStrings = 1;
                while (!strings[j + 1].trim().isBlank()) {
                    countNonEmptyStrings ++;
                    j++;
                }
                System.arraycopy(strings, i, nonEmptyStrings, index2, countNonEmptyStrings);
                index2 += countNonEmptyStrings;
            }
            i = j;
        }

        System.out.println("Исходный массив: " + Arrays.toString(strings));
        System.out.println("Массив без пустых строк: " + Arrays.toString(nonEmptyStrings));
    }

    private static void printFloatArray(float @NotNull [] floats) {
        len = floats.length;
        for (int i = 0; i < len; i++) {
            System.out.printf("%7.3f", floats[i]);
            if (i == len / 2) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static boolean isUnique(int @NotNull [] ints, int num) {
        for (int currentNum : ints) {
            if (currentNum == num) {
                return true;
            }
        }
        return false;
    }

    private static void printIntArray(int @NotNull [] ints) {
        for (int num: ints) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int countNonEmptyStrings(String @NotNull [] strings) {
        int count = 0;
        for (String s : strings) {
            if (!s.trim().isBlank()) {
                count++;
            }
        }
        return count;
    }
}
