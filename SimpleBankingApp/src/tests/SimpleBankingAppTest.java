package tests;

import app.SimpleBankingApp;
import controller.AccountController;
import utils.TestUtils;

public class SimpleBankingAppTest {
    public static void main(String[] args) {
        testLoadData();
        testDeposits();
        testWithdrawals();
    }

    public static void testLoadData() {
        SimpleBankingApp.loadUserData();
        if (SimpleBankingApp.users.size() == 3) {
            TestUtils.printTestPassed("SimpleBankingAppTest - User Data Load");
        } else {
            TestUtils.printTestFailed("SimpleBankingAppTest - User Data Load");
        }

        SimpleBankingApp.loadAccountData();
        if (SimpleBankingApp.accounts.size() >= 2) {
            TestUtils.printTestPassed("SimpleBankingAppTest - Account Data Load");
        } else {
            TestUtils.printTestFailed("SimpleBankingAppTest - Account Data Load");
        }
    }

    public static void testDeposits() {
        double initialBalance = AccountController.getBalance("5495-1234", SimpleBankingApp.transactions);
        double depositAmount = 100.00;

        SimpleBankingApp.addTransaction("5495-1234", depositAmount);
        double updatedBalance = AccountController.getBalance("5495-1234", SimpleBankingApp.transactions);

        if (updatedBalance == initialBalance + depositAmount) {
            TestUtils.printTestPassed("SimpleBankingAppTest - Deposit Test");
        } else {
            TestUtils.printTestFailed("SimpleBankingAppTest - Deposit Test");
        }
    }

    public static void testWithdrawals() {
        double initialBalance = AccountController.getBalance("5495-1234", SimpleBankingApp.transactions);
        double withdrawalAmount = 50.00;

        SimpleBankingApp.addTransaction("5495-1234", -withdrawalAmount);
        double updatedBalance = AccountController.getBalance("5495-1234", SimpleBankingApp.transactions);

        if (updatedBalance == initialBalance - withdrawalAmount) {
            TestUtils.printTestPassed("SimpleBankingAppTest - Withdrawal Test");
        } else {
            TestUtils.printTestFailed("SimpleBankingAppTest - Withdrawal Test");
        }
    }
}
