package com.example.library_management.models;

public class Member extends User{
    private int totalBooksCheckedOut;
    private LibraryCard libraryCard; //OneToOne

    public Member(int totalBooksCheckedOut, LibraryCard libraryCard) {
        this.totalBooksCheckedOut = totalBooksCheckedOut;
        this.libraryCard = libraryCard;
    }

    public int getTotalBooksCheckedOut() {
        return totalBooksCheckedOut;
    }

    public void setTotalBooksCheckedOut(int totalBooksCheckedOut) {
        this.totalBooksCheckedOut = totalBooksCheckedOut;
    }

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }

    public boolean canBorrowMoreBooks() {
        return totalBooksCheckedOut < 2;
    };
}
