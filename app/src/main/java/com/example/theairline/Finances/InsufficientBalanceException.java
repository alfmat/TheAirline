package com.example.theairline.Finances;

public class InsufficientBalanceException extends Exception {
    @Override
    public String toString() {
        return "Insufficient Balance";
    }
}
