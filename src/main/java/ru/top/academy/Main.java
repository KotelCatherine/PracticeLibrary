package ru.top.academy;

import ru.top.academy.library.Book;
import ru.top.academy.library.Library;

/**
 * - Добавьте несколько книг в библиотеку.
 * - Удалите книгу по ID.
 * - Найдите книгу по названию.
 * - Выведите все книги и книги конкретного автора.
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "Dark Tower", "Steven King"));
        library.addBook(new Book(5, "Misery", "Steven King"));
        library.addBook(new Book(2, "Some Book", "SomeAuthor"));
        library.addBook(new Book(3, "Alice's Adventures", "Lewis Carroll"));

        library.findBookByTitle("Dark");

        System.out.println("\nУдаление");
        library.removeBookById(2);

        System.out.println("\nВсе книги");
        library.listAllBooks();

        System.out.println("\nПо названию");
        library.findBookByTitle("Alice's Adventures");

        System.out.println("\nПо автору");
        library.listBooksByAuthor("Steven King");
    }
}