package BankSystem.service;

import BankSystem.entiti.Account;
import BankSystem.entiti.Bill;

public class PaymentService {
    public void pay(Account account, int amount){
        Bill bill = account.getBill();
        if(bill.getAmount() < amount){
            System.out.println("Платёж невозможен, недостаточно средств");
        }else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Текущее значение счёта: " + currentBillAmount);
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платёж завершён, новое значение счёта: " + bill.getAmount());
        }
    }
}
