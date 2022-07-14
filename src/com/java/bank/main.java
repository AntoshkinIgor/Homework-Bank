package com.java.bank;

public class main {

    public static void main(String[] args) {
        //Создание пользователя 1
        Person antoshkinigor = new Person("Igor","Antoshkin","7911111111");
        Bill billAntoshkinigor = new Bill();
        billAntoshkinigor.setAmount(10000);
        Account account = new Account(billAntoshkinigor, antoshkinigor);
        System.out.println("новый аккаунт: " + account);

        //Создание пользовтаеля 2
        Person maltcevmaxim = new Person("Maxim","Maltcev","7911111112");
        Bill billMaltcevmaxim = new Bill();
        billMaltcevmaxim.setAmount(10000);
        Account account1 = new Account(billMaltcevmaxim, maltcevmaxim);
        System.out.println("новый аккаунт: " + account1);

        // Перевод
        TransferService transferService = new TransferService();
        transferService.transfer(account, account1, 9754);
        System.out.println(account.getBill().getAmount());
        System.out.println(account1.getBill().getAmount());
        //Пополнение счета
          //Создание Deposit
        Bill billDeposit = new Bill();
        billDeposit.setAmount(228);
        Deposit deposit = new Deposit(billDeposit);
          //Само пополнение
        DepositService.deposit(account,deposit);
        System.out.println("Баланс на счете по номеру телефона " + account.getPerson().getMobileNumber() + " : " + account.getBill().getAmount());
        //Списание
          //создание Payment
        Bill billPayment = new Bill();
        billPayment.setAmount(228);
        Payment payment = new Payment(billPayment);
          //Само списание
        PaymentService.payment(account1,payment);
        System.out.println("Баланс на счете по номеру телефона " + account1.getPerson().getMobileNumber() + " : " + account1.getBill().getAmount());

//GITss






        System.out.println();


    }
}
