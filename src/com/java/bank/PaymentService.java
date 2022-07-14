package com.java.bank;

public class PaymentService {
    public static void payment(Account account, Payment payment) {
        int billAccount = account.getBill().getAmount();
        int billPayment = payment.getBill().getAmount();
        if(billAccount >= 0) {
            if (billPayment > 0) {
            int newBillAccount = billAccount - billPayment;
            int newBillPayment = 0;
            account.getBill().setAmount(newBillAccount);
            payment.getBill().setAmount(newBillPayment);
            System.out.println("Оплата со счета по номеру: "+ account.getPerson().getMobileNumber() +", на сумму: "+ billPayment + " прошла успешно");
            }
        } else {
            System.out.println("Недостаточно средств для оплаты");
        }
    }
}
