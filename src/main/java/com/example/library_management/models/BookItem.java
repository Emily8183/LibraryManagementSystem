package com.example.library_management.models;

import java.util.ArrayList;
import java.util.List;

public class BookItem {
    private int barcode;
    private boolean isAvailable;
    private Book book; //ManyToOne

    private List<BookLending> lendingHistory;

    public BookItem(int barcode, Book book) {
        this.barcode = barcode;
        this.isAvailable = true;
        this.book = book;
        this.lendingHistory = new ArrayList<>();
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void addLendingHistory(BookLending lending) {
        lendingHistory.add(lending);
    }

    public List<BookLending> getLendingHistory() {
        return lendingHistory;
    }
}
