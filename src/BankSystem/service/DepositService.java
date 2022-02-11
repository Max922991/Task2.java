package BankSystem.service;

import BankSystem.entiti.Account;
import BankSystem.entiti.Bill;

public class DepositService {
    public void deposit(Account account, int amount){
        Bill bill = account.getBill();
        int currentBillAmount = bill.getAmount();
        System.out.println("Текущее значение счёта: " + currentBillAmount);
        bill.setAmount(currentBillAmount + amount);
        System.out.println("Пополнение счёта прошло успешно, новое значение: " + bill.getAmount());

    }
}
