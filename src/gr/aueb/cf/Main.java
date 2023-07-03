package gr.aueb.cf;

import gr.aueb.cf.exceptions.InsufficientBalanceException;
import gr.aueb.cf.exceptions.NegativeAmountException;
import gr.aueb.cf.exceptions.SsnNotValidException;
import gr.aueb.cf.model.Account;
import gr.aueb.cf.model.OverdraftAccount;
import gr.aueb.cf.model.OverdraftJointAccount;
import gr.aueb.cf.model.User;

public class Main {

    public static void main(String[] args) {
        User george = new User("George", "Adamidis", "12345");
        User anna = new User("Anna", "Georganti", "56789");
        Account account = new Account(george, "GR12345", 100);
        Account overGeorge = new OverdraftAccount(george, "GR23456", 50);
        Account overJointAccount = new OverdraftJointAccount(george, "GR256789", 200.50, anna);

        try {
            System.out.println("Account: \n" + account);
            System.out.println("Overdraft: \n" + overGeorge);


            overJointAccount.deposit(100);
            overJointAccount.withdraw(50, "16789");

            System.out.println("Overdraft joint account: \n" + overJointAccount);
        } catch (NegativeAmountException | InsufficientBalanceException | SsnNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
