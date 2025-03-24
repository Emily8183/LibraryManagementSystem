package com.example.library_management.models;

public class BookItem {
    private int barcode;
    private boolean isAvailable;
    private Book book; //ManyToOne

    public BookItem(int barcode, boolean isAvailable, Book book) {
        this.barcode = barcode;
        this.isAvailable = isAvailable;
        this.book = book;
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
}
