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

    private OverdueManagement overdueManagement;

    public BookLending(int lendingId, Member member, BookItem bookItem, Librarian librarian, LocalDate lendDate, LocalDate dueDate, OverdueManagement overdueManagement) {
        this.lendingId = lendingId;
        this.member = member;
        this.bookItem = bookItem;
        this.librarian = librarian;
        this.lendDate = lendDate;
        this.returnDate = null;
        this.dueDate = dueDate;
        this.overdueManagement = overdueManagement;
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
        bookItem.addLendingHistory(this);
        member.setTotalBooksCheckedOut(member.getTotalBooksCheckedOut() + 1);


        return true;
    };

    public boolean returnBook(LocalDate returnDate, Librarian librarian) {

        this.returnDate = returnDate;
        this.librarian = librarian;
        bookItem.setAvailable(true);
        member.setTotalBooksCheckedOut(member.getTotalBooksCheckedOut() - 1);

        OverdueManagement overdueManagement = new OverdueManagement();
        int overdueDays = overdueManagement.calculateOverdueDays(returnDate, dueDate);

        if (overdueDays > 0) {
            double fineAmount = overdueManagement.calculateFine(overdueDays);
            Fine fine = new Fine(fineAmount);
            System.out.println("Overdue fine recorded: $" + fineAmount);
            member.addFine(fine); // Store fine in member's record
        }

        return true;
    };
 }
