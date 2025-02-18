package model;

import java.util.Date;

public class Account {
    private String accountNumber;
    private String username;
    private String accountType;
    private Date openingDate;

    public Account(String accountNumber, String username, String accountType, Date openingDate) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.accountType = accountType;
        this.openingDate = openingDate;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getUsername() { return username; }
    public String getAccountType() { return accountType; }
    public Date getOpeningDate() { return openingDate; }

    @Override
    public String toString() {
        return String.format("%-10s| %-30s| %-10s| %-15s", accountNumber, username, accountType, openingDate.toString());
    }
}

