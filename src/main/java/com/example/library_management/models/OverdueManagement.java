package com.example.library_management.models;

import java.time.LocalDate;

public class OverdueManagement {

    private static final int MAX_OVERDUE_DAYS = 20;
    private static final double FINE_PER_DAY = 1.0;

    public static boolean isOverdue(LocalDate returnDate, LocalDate dueDate) {
        return returnDate.isAfter(dueDate);
    }

    public static long getOverdueDays(LocalDate returnDate, LocalDate dueDate) {
        if (isOverdue(returnDate, dueDate)) {
            return returnDate.toEpochDay() - dueDate.toEpochDay();
        }
        return 0; // Not overdue
    }

    public static double calculateFine(long overdueDays) {
        if (overdueDays > 0) {
            return overdueDays * FINE_PER_DAY;
        }
        return 0; // No fine if not overdue
    }


}
