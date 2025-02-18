package tests;

import app.SimpleBankingApp;
import controller.AccountController;
import utils.TestUtils;

public class BalanceTest {
    public static void main(String[] args) {
        testGetBalance(); 
    }

    public static void testGetBalance() {
       
        SimpleBankingApp.loadAccountData();
        SimpleBankingApp.addTransaction("5495-1234", 100.00);
        SimpleBankingApp.addTransaction("5495-1234", -30.00);
        SimpleBankingApp.addTransaction("5495-1234", 50.00);

      
        double expectedBalance = 120.00;
        double actualBalance = AccountController.getBalance("5495-1234", SimpleBankingApp.transactions);

        if (actualBalance == expectedBalance) {
            TestUtils.printTestPassed("SimpleBankingAppTest - getBalance()");
        } else {
            TestUtils.printTestFailed("SimpleBankingAppTest - getBalance()");
            System.out.println("Expected: " + expectedBalance + ", but got: " + actualBalance);
        }
    }
}
