package com.example.library_management.models;

import java.time.LocalDate;

public class BookLending {
    private final int lendingId;

    private Member member;

    private BookItem bookItem;

    private Librarian librarian;

    private LocalDate lendDate;

    private LocalDate returnDate;

    private LocalDate dueDate;

    public BookLending(int lendingId, Member member, BookItem bookItem, Librarian librarian) {
        this.lendingId = lendingId;
        this.member = member;
        this.bookItem = bookItem;
        this.librarian = librarian;
        this.lendDate = null;
        this.returnDate = null;
        this.dueDate = null;
    }

    //lendingId不需要setter
    public int getLendingId() {
        return lendingId;
    }

    public Member getMember() {
        return member;
    }

    public BookItem getBookItem() {
        return bookItem;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public LocalDate getLendDate() {
        return lendDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean borrowBook(LocalDate lendDate, LocalDate dueDate, Librarian librarian) {

        LibraryCard libraryCard = member.getLibraryCard();

        if (!libraryCard.isValid()) return false;

        if (!member.canBorrowMoreBooks()) return false;

        this.lendDate = lendDate;
        this.dueDate = dueDate;
        this.returnDate = null;
        this.librarian = librarian;
        bookItem.setAvailable(false);
        member.setTotalBooksCheckedOut(member.getTotalBooksCheckedOut() + 1);

        return true;
    };

    public boolean returnBook(LocalDate returnDate, Librarian librarian) {

        LibraryCard libraryCard = member.getLibraryCard();

        if (!libraryCard.isValid()) return false; //librarycard is cancelled, can't return books

        this.returnDate = returnDate;
        this.librarian = librarian;
        bookItem.setAvailable(true);
        member.setTotalBooksCheckedOut(member.getTotalBooksCheckedOut() - 1);

        return true;
    };
 }
