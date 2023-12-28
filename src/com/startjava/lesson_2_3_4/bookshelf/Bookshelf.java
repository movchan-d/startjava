package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int SIZE = 10;
    private final Book[] books = new Book[SIZE];
    private int countBooks;
    private int maxLength;

    public int getCountBooks() {
        return countBooks;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getCountFreeShelves() {
        return SIZE - countBooks;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public boolean saveBook(Book book) {
        if (countBooks < SIZE) {
            books[countBooks++] = book;
            maxLength = Math.max(maxLength, book.getLength());
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                int length = books[i].getLength();
                System.arraycopy(books, i + 1, books, i, countBooks - i - 1);
                countBooks--;
                books[countBooks] = null;
                updateMaxLength(length);
                return true;
            }
        }
        return false;
    }

    private void updateMaxLength(int length) {
        if (countBooks > 0) {
            if (length == maxLength) {
                maxLength = books[0].getLength();
                for (int i = 0; i < countBooks; i++) {
                    maxLength = Math.max(maxLength, books[i].getLength());
                }
            }
        } else maxLength = 0;
    }

    public Book find(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null );
        countBooks = 0;
    }
}
