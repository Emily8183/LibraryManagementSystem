package com.example.library_management.models;

public class LibraryCard {
    private String cardNumber;
    private boolean isValid;

    public LibraryCard(String cardNumber, boolean isValid) {
        this.cardNumber = cardNumber;
        this.isValid = isValid;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        this.isValid= valid;
    }
}
