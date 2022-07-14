package com.java.bank;

public class Deposit {
    private Bill bill;

    public Deposit(Bill bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "bill=" + bill +
                '}';
    }

    public Bill getBill() {
        return bill;
    }
    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
