package com.example.library_management.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OverdueManagement {

    private static final int MAX_OVERDUE_DAYS = 20;
    private static final double DAILY_FINE_RATE = 1.0;

    public static boolean isOverdue(LocalDate returnDate, LocalDate dueDate) {
        return returnDate.isAfter(dueDate);
    }

    public int calculateOverdueDays(LocalDate returnDate, LocalDate dueDate) {
        if (returnDate.isAfter(dueDate)) {
            return (int) ChronoUnit.DAYS.between(dueDate, returnDate);
        }
        return 0; // No overdue
    }

    public double calculateFine(int overdueDays) {
        return overdueDays * DAILY_FINE_RATE;
    }


}
