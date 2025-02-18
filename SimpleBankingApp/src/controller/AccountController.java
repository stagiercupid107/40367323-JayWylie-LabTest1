package controller;

import model.Account;
import model.Transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class AccountController {
    public static Vector<Account> loadAccountData() {
        Vector<Account> accounts = new Vector<>();
        try {
            accounts.add(new Account("5495-1234", "mike", "Standard", new SimpleDateFormat("dd/MM/yyyy").parse("20/08/2019")));
            accounts.add(new Account("5495-1291", "mike", "Saving", new SimpleDateFormat("dd/MM/yyyy").parse("21/07/2019")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public static void printAllAccounts(Vector<Account> accounts, Vector<Transaction> transactions) {
        System.out.println("Accounts:");
        for (Account account : accounts) {
            System.out.println(account + " | Balance: $" + getBalance(account.getAccountNumber(), transactions));
        }
    }

    public static double getBalance(String accountNumber, Vector<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getAccountNumber().equals(accountNumber))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }
}
