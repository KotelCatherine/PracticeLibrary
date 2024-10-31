package ru.top.academy.library;

import java.util.*;

/**
 * - Поля: booksList (тип ArrayList<Book>), booksSet (тип HashSet<Book>), booksMap (тип HashMap<Integer, Book>).
 * - Методы:
 * - addBook(Book book): добавляет книгу в библиотеку.
 * - removeBookById(int id): удаляет книгу по её идентификационному номеру.
 * - findBookByTitle(String title): ищет книгу по названию и возвращает её.
 * - listAllBooks(): выводит список всех книг.
 * - listBooksByAuthor(String author): выводит список книг конкретного автора.
 */
public class Library {
    private List<Book> booksList = new ArrayList<>();
    private Set<Book> booksSet = new HashSet<>();
    private Map<Integer, Book> booksMap = new HashMap<>();

    public void addBook(Book book) {
        booksList.add(book);
        booksSet.add(book);
        booksMap.put(book.getId(), book);
    }

    public void removeBookById(int id) {
        Book book = booksMap.remove(id);

        if (book != null) {
            booksSet.remove(book);
            booksList.remove(book);
        }
    }

    public void findBookByTitle(String title) {
        booksList.stream().filter(book -> book.getTitle().equalsIgnoreCase(title)).forEach(System.out::println);
    }

    public void listAllBooks() {
        booksList.forEach(System.out::println);
    }

    public void listBooksByAuthor(String author) {
        booksList.stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).forEach(System.out::println);
    }

}
