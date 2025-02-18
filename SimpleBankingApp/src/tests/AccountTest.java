package tests;

import model.Account;
import utils.TestUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountTest {
    public static void main(String[] args) {
        testAccountGetters();
    }

    public static void testAccountGetters() {
        try {
            Date openingDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022");
            Account account = new Account("12345678", "john.doe@gmail.com", "Standard", openingDate);

            if (account.getAccountNumber().equals("12345678")) {
                TestUtils.printTestPassed("AccountTest - getAccountNumber()");
            } else {
                TestUtils.printTestFailed("AccountTest - getAccountNumber()");
            }

            if (account.getUsername().equals("john.doe@gmail.com")) {
                TestUtils.printTestPassed("AccountTest - getUsername()");
            } else {
                TestUtils.printTestFailed("AccountTest - getUsername()");
            }

            if (account.getAccountType().equals("Standard")) {
                TestUtils.printTestPassed("AccountTest - getAccountType()");
            } else {
                TestUtils.printTestFailed("AccountTest - getAccountType()");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
