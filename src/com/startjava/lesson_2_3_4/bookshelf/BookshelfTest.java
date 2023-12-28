package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    private static final int QUIT = 5;
    static Scanner console = new Scanner(System.in);
    static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        do {
            printBookshelf();
            printMenu();
        } while (executeMenuItem() != QUIT);
    }

    private static void printBookshelf() {

        if (bookshelf.getCountBooks() == 0) {
            System.out.println("\nШкаф пустой.");
        } else {
            Book[] books = bookshelf.getBooks();

            System.out.println("\nВ шкафу книг - " + books.length + ", свободно полок - " +
                    bookshelf.getCountFreeShelves());
            int maxLength = bookshelf.getMaxLength();
            for (Book book : books) {
                System.out.println("|" + book + ".".repeat(maxLength - book.getLength())+ "|");
                System.out.println("|" + "-".repeat(maxLength) + "|");
            }
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
        String item = console.nextLine();
        switch (item) {
            case "1" -> addBook();
            case "2" -> deleteBook();
            case "3" -> findBook();
            case "4" -> clearBookshelf();
            case "5" -> {return QUIT;}
            default -> System.out.println("Введите номер из списка.");
        }
        return 0;
    }

    private static void addBook() {
        System.out.print("Введите автора: ");
        String author = console.nextLine();
        System.out.print("Введите название: ");
        String title = console.nextLine();
        System.out.print("Введите год издания: ");
        int year = console.nextInt();
        console.nextLine();

        Book book = new Book(author, title, year);
        System.out.print(bookshelf.saveBook(book) ? "\nКнига сохранена.\n" : "\nШкаф заполнен, книгу нельзя добавить.\n");
    }

    private static void deleteBook() {
        System.out.print("Введите название книги: ");
        System.out.print(bookshelf.delete(console.nextLine()) ? "\nКнига удалена.\n" : "\nКнига не найдена.\n");
    }

    private static void findBook() {
        System.out.print("Введите название книги: ");
        Book book = bookshelf.find(console.nextLine());
        System.out.print(book != null ? book + "\n": "\nКнига не найдена.\n");
    }

    private static void clearBookshelf() {
        bookshelf.clear();
        System.out.println("\nШкаф очищен.");
    }
}
