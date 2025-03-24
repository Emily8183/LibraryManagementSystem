package com.example.library_management.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String ISBN;
    private String title;
    private int totalCopies;

    private List<BookItem> bookItems;

    public Book(String ISBN, String title, int totalCopies) {
        this.ISBN = ISBN;
        this.title = title;
        this.totalCopies = totalCopies;
        this.bookItems = new ArrayList<>();
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public void addBookItem(BookItem bookItem) {
        bookItems.add(bookItem);
    }
}
