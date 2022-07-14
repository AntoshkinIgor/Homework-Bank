package com.java.bank;

public class Payment {
    private Bill bill;
    public Payment(Bill bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Payment{" +
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
