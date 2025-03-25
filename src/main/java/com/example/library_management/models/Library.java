package com.example.library_management.models;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<BookLending> lendingRecords;

    public Library() {
        this.books = new ArrayList<>();
        this.lendingRecords = new ArrayList<>();
    }

    public List<BookLending> getLendingRecords() {
        return lendingRecords;
    }

    public void addLendingRecord(BookLending lendingRecord) {
        lendingRecords.add(lendingRecord);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addBookItem(Book book, BookItem bookItem) {
        if (!books.contains(book)) {
            books.add(book);
            System.out.println("Book added to the library.");
        }

        book.addBookItem(bookItem);
    }

    public List<BookLending> getLast5CheckedOutBooks() { /*  */}




}
