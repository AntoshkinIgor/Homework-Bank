package com.java.bank;

public class Bill {
    private int amount;
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "amount=" + amount +
                '}';
    }
}
