package BankSystem;

import BankSystem.entiti.Account;
import BankSystem.entiti.Bill;
import BankSystem.entiti.Person;
import BankSystem.service.DepositService;
import BankSystem.service.PaymentService;
import BankSystem.service.TransferService;

public class Main {
    public static void main(String[] args) {

        Person LoriPerson = new Person("Lori", "+3128431", "Cat");
        Bill LoriBill = new Bill(10000);
        Account LoriAccount = new Account(LoriPerson, LoriBill);

        Person martinPerson = new Person("Martin", "+12345678", "Dog");
        Bill martinbill = new Bill(8000);
        Account martinAccount = new Account(martinPerson, martinbill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(LoriAccount, 1000);
        paymentService.pay(martinAccount, 1500);

        DepositService depositService = new DepositService();
        depositService.deposit(LoriAccount, 3000);
        depositService.deposit(martinAccount, 3500);

        System.out.println();
        TransferService transferService = new TransferService();
        transferService.transfer(LoriAccount, martinAccount, 3000);






    }
}
