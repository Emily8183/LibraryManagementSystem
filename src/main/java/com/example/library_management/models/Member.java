package com.example.library_management.models;

import java.util.ArrayList;
import java.util.List;

public class Member extends User{
    private int totalBooksCheckedOut;
    private LibraryCard libraryCard; //OneToOne

    private List<Fine> fines;

    public Member(int totalBooksCheckedOut, LibraryCard libraryCard) {
        //TODO: super()?????
        this.totalBooksCheckedOut = totalBooksCheckedOut;
        this.libraryCard = libraryCard;
        this.fines = new ArrayList<>();
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

    public void addFine(Fine fine) {
        fines.add(fine);
    }

    public void payFine(int fineId) {
        for (Fine fine : fines) {
            if (fine.getId() == fineId && !fine.isPaid()) {
                fine.payFine();
                return;
            }
        }
        System.out.println("No outstanding fine found with ID: " + fineId);
    }

    public double getTotalUnpaidFines() {
        return fines.stream()
                .filter(f -> !f.isPaid())
                .mapToDouble(Fine::getAmount)
                .sum();
    }

    public List<Fine> getFines() {
        return fines;
    }
}
