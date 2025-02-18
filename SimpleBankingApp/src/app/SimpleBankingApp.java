package app;

import controller.AccountController;
import controller.UserController;
import model.Account;
import model.Transaction;
import model.User;

import java.util.Calendar;
import java.util.Vector;

public class SimpleBankingApp {
    public static Vector<User> users = new Vector<>();
    public static Vector<Account> accounts = new Vector<>();
    public static Vector<Transaction> transactions = new Vector<>();

    public static void loadUserData() {
        users = UserController.loadUserData();
    }

    public static void loadAccountData() {
        accounts = AccountController.loadAccountData();
    }

    public static void printAllUsers() {
        UserController.printAllUsers(users);
    }

    public static void printAllAccounts() {
        AccountController.printAllAccounts(accounts, transactions);
    }

    public static void addTransaction(String accountNumber, double amount) {
        if (amount == 0) {
            System.out.println("Transaction amount must be non-zero!");
            return;
        }
        Transaction newTransaction = new Transaction(accountNumber, amount, Calendar.getInstance().getTime());
        transactions.add(newTransaction);
    }

    public static void main(String[] args) {
        loadUserData();
        printAllUsers();
        loadAccountData();
        System.out.println("Accounts: initial state, after loading...");
        printAllAccounts();

        addTransaction("5495-1234", -50.21);
        System.out.println("Account: after 1st transaction...");
        printAllAccounts();

        addTransaction("5495-1234", 520.00);
        addTransaction("9999-1111", 21.00);
        System.out.println("Account: after more transactions...");
        printAllAccounts();
    }
}

