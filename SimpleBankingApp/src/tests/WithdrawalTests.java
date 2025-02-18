package tests;

import app.SimpleBankingApp;
import controller.AccountController;
import utils.TestUtils;

public class WithdrawalTests {
    public static void main(String[] args) {
        testWithdrawals(); 
    }

    public static void testWithdrawals() {
        SimpleBankingApp.loadAccountData();

        SimpleBankingApp.addTransaction("5495-1234", 200.00);

        double withdrawalAmount = 50.00;
        double initialBalance = AccountController.getBalance("5495-1234", SimpleBankingApp.transactions);

        SimpleBankingApp.addTransaction("5495-1234", -withdrawalAmount);
        double updatedBalance = AccountController.getBalance("5495-1234", SimpleBankingApp.transactions);

        if (updatedBalance == initialBalance - withdrawalAmount) {
            TestUtils.printTestPassed("SimpleBankingAppTest - testWithdrawals()");
        } else {
            TestUtils.printTestFailed("SimpleBankingAppTest - testWithdrawals()");
            System.out.println("Expected: " + (initialBalance - withdrawalAmount) + ", but got: " + updatedBalance);
        }
    }
}
