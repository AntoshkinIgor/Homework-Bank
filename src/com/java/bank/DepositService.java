package com.java.bank;

public class DepositService {
    public static void deposit(Account account, Deposit deposit) {
        int billAccount = account.getBill().getAmount();
        int billDeposit = deposit.getBill().getAmount();
        if(billDeposit > 0) {
            int newBillAccount = billAccount + billDeposit;
            int newBillDeposit = 0;
            account.getBill().setAmount(newBillAccount);
            deposit.getBill().setAmount(newBillDeposit);
            System.out.println("Пополнение счета по номеру: "+ account.getPerson().getMobileNumber() +", на сумму: "+ billDeposit);
        } else {
            System.out.println("Недостаточно средств для пополнения счета");
        }
    }
}
