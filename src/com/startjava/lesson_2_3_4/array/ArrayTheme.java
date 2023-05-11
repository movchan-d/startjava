package com.startjava.lesson_2_3_4.array;

import org.jetbrains.annotations.NotNull;
import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
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
        int[] numbers = {11, 2, 33, 4, 55, 6, 77};
        // до модификации
        printIntArray(numbers);

        // перестановка значений в обратном порядке
        for (int i = 0; i < numbers.length / 2; i++) {
            int num = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = num;
        }
        // отображение массива после модификации
        printIntArray(numbers);
    }

    private static void multiplyArrayElements() {
        System.out.println();
        System.out.println("2. Вывод произведения элементов массива");

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        int prod = 1;
        for (int i = 1; i < numbers.length - 1; i++) {
            prod *= numbers[i];
            System.out.print(numbers[i]);
            System.out.print( i < numbers.length - 2 ? " * " : " = " + prod);
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0 || numbers[i] == 9) {
                System.out.println("Элемент массива " + numbers[i] + " имеет индекс " + i);
            }
        }
    }

    private static void deleteArrayElements() {
        System.out.println();
        System.out.println("3. Удаление элементов массива");

        // Заполнение массива случайными вещественными числами
        Random rnd = new Random();
        float[] numbers = new float[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextFloat(100) / 100;
        }
        System.out.println("Исходный массив:");
        printFloatArray(numbers);

        // Перезапись элементов массива
        float middleElement = numbers[numbers.length / 2];
        int numElementsChanged = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > middleElement) {
                numbers[i] = 0;
                numElementsChanged++;
            }
        }
        System.out.println("Измененный массив:");
        printFloatArray(numbers);
        System.out.println("Количество обнуленных элементов: " + numElementsChanged);
    }

    private static void reverseLadderArray() {
        System.out.println();
        System.out.println("4. Вывод элементов массива лесенкой в обратном порядке");

        // Создание и заполнение массива
        char[] letters = new char[26];
        char letter = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = letter;
            letter++;
        }

        // Вывод элементов массива лесенкой в обратном порядке
        for (int i = letters.length - 1; i >= 0; i--) {
            for (int j = i; j < letters.length; j++) {
                System.out.print(letters[j]);
            }
            System.out.println();
        }
    }

    private static void generateUniqueNumbersArray() {
        System.out.println();
        System.out.println("5. Генерация уникальных чисел");

        int[] numbers = new int[30];
        Random rnd = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int num;
            do {
                num = rnd.nextInt(40) + 60;
            } while (checkNumberExists(numbers, num ));
            numbers[i] = num;
        }
        Arrays.sort(numbers);
        printIntArray(numbers);
    }

    private static void copyNonEmptyLines() {
        System.out.println();
        System.out.println("6. Копирование не пустых строк");

        String[] arr1 = new String[]{"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        String[] arr2 = new String[countNonEmptyStrings(arr1)];

        int index2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            int j = i;
            if (!arr1[i].trim().isEmpty()) {
                int countNonEmptyStrings = 1;
                while (!arr1[j + 1].trim().isEmpty()) {
                    countNonEmptyStrings ++;
                    j++;
                }
                System.arraycopy(arr1, i, arr2, index2, countNonEmptyStrings);
                index2 += countNonEmptyStrings;
            }
            i = j;
        }

        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }

    private static void printFloatArray(float @NotNull [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%7.3f", numbers[i]);
            if (i == numbers.length / 2) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static boolean checkNumberExists(int @NotNull [] arr, int num) {
        for (int currentNum : arr) {
            if (currentNum == num) {
                return true;
            }
        }
        return false;
    }

    private static void printIntArray(int @NotNull [] arr) {
        for (int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int countNonEmptyStrings(String @NotNull [] arr) {
        int count = 0;
        for (String s : arr) {
            if (!s.trim().isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
