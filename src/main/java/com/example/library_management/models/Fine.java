package com.example.library_management.models;

public class Fine {
    private static int idCounter = 1;
    private int id;
    private Member member;
    private double amount;
    private boolean isPaid;

    public Fine(Member member, double amount) {
        this.id = idCounter++; // Assign unique ID
        this.member = member;
        this.amount = amount;
        this.isPaid = false;
    }

    public void payFine() {
        this.isPaid = true;
        System.out.println("Fine ID " + id + " paid by " + member.getUsername() + ": $" + amount);
    }

    public boolean isPaid() {
        return isPaid;
    }

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    public Member getMember() {
        return member;
    }
}
