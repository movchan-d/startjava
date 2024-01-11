package com.startjava.lesson_2_3_4.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookshelfTest {

    private static final int QUIT = 5;
    private static final String MESSAGE_TITLE = "Введите название книги: ";
    static Scanner console = new Scanner(System.in);
    static Bookshelf bookshelf = new Bookshelf();
    private static boolean errorMenuItem;

    public static void main(String[] args) {
        do {
            printBookshelf();
            printMenu();
        } while (executeMenuItem() != QUIT);
    }

    private static void printBookshelf() {
        if (bookshelf.getCountBooks() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу\n");
        } else {
            Book[] books = bookshelf.getBooks();

            System.out.println("\nВ шкафу книг - " + books.length + ", свободно полок - " +
                    bookshelf.getCountFreeShelves());
            int maxLength = bookshelf.getMaxLength();
            for (Book book : books) {
                System.out.println("|" + book + ".".repeat(maxLength - book.getLength()) + "|");
                System.out.println("|" + "-".repeat(maxLength) + "|");
            }
            System.out.println("|" + " ".repeat(maxLength) + "|\n");
        }
    }

    private static void printMenu() {
        System.out.println("""
                1. Добавить книгу
                2. Удалить книгу
                3. Найти книгу
                4. Очистить шкаф
                5. Завершить
                """);
        System.out.print("Выберите пункт меню: ");
    }

    private static int executeMenuItem() {
        do {
            errorMenuItem = false;
            String item = console.nextLine();
            switch (item) {
                case "1" -> addBook();
                case "2" -> deleteBook();
                case "3" -> findBook();
                case "4" -> clearBookshelf();
                case "5" -> {return QUIT;}
                default -> raiseMenuError();
            }
        } while (errorMenuItem);
        pressEnter();
        return 0;
    }

    private static void addBook() {
        System.out.print("\nВведите автора: ");
        String author = console.nextLine();
        String title = inputTitle();
        int publicationYear = inputPublicationYear();
        console.nextLine();

        Book book = new Book(author, title, publicationYear);
        System.out.print(bookshelf.save(book) ? "\nКнига сохранена.\n" : "\nШкаф заполнен, книгу нельзя добавить.\n");
    }

    private static String inputTitle() {
        System.out.print(MESSAGE_TITLE);
        return console.nextLine();
    }

    private static int inputPublicationYear() {
        boolean isValidYear = false;
        int year = 0;
        System.out.print("Введите год издания: ");
        while (!isValidYear) {
            try {
                year = console.nextInt();
                isValidYear = true;
            } catch (InputMismatchException exception) {
                System.out.print("Некорректный формат. Введите год публикации: ");
                console.nextLine();
            }
        }
        return year;
    }

    private static void deleteBook() {
        System.out.print(bookshelf.delete(inputTitle()) ? "\nКнига удалена.\n" : "\nКнига не найдена.\n");
    }

    private static void findBook() {
        Book book = bookshelf.find(inputTitle());
        System.out.print(book != null ? book + "\n": "\nКнига не найдена.\n");
    }

    private static void clearBookshelf() {
        bookshelf.clear();
        System.out.println("\nШкаф очищен.");
    }

    private static void raiseMenuError() {
        errorMenuItem = true;
        System.out.print("Ошибка! Введите номер из списка: ");
    }

    private static void pressEnter() {
        String enter;
        do {
            System.out.print("Для продолжения нажмите Enter");
            enter = console.nextLine();
        } while (!enter.isEmpty());
    }
}
