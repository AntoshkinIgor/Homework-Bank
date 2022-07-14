package com.java.bank;

public class TransferService {
    public void transfer(Account from, Account to, int amount) {
        if (from.getBill().getAmount() >= amount) {
            Bill fromBill = from.getBill();
            Bill toBill = to.getBill();
            fromBill.setAmount(fromBill.getAmount() - amount);
            toBill.setAmount(toBill.getAmount() + amount);
            from.setBill(fromBill);
            to.setBill(toBill);
            System.out.println("Перевод размером " + amount + " выполнен успешно. Ваш баланс: " + fromBill.getAmount());
        } else {
            String fromPerson = from.getPerson().getFirstName();
            String toPerson = to.getPerson().getFirstName();
            int skolkonehvataet = (from.getBill().getAmount() - amount)+(-(from.getBill().getAmount() - amount)*2);
            System.out.println("У клиента " + fromPerson + " недостаточно средств на счете для перевода клиенту " + toPerson + ". Треубется пополнить баланс на " + skolkonehvataet);

        }
    }
}

