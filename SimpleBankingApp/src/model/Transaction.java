package model;

import java.util.Date;

public class Transaction {
    private String accountNumber;
    private double amount;
    private Date transactionDate;

    public Transaction(String accountNumber, double amount, Date transactionDate) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getAmount() { return amount; }
    public Date getTransactionDate() { return transactionDate; }

    @Override
    public String toString() {
        return String.format("%-10s| %-10.2f| %-15s", accountNumber, amount, transactionDate.toString());
    }
}
