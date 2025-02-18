package tests;

import model.Transaction;
import utils.TestUtils;

import java.util.Date;

public class TransactionTest {
    public static void main(String[] args) {
        testTransactionGetters();
    }

    public static void testTransactionGetters() {
        Transaction transaction = new Transaction("12345678", 150.00, new Date());

        if (transaction.getAccountNumber().equals("12345678")) {
            TestUtils.printTestPassed("TransactionTest - getAccountNumber()");
        } else {
            TestUtils.printTestFailed("TransactionTest - getAccountNumber()");
        }

        if (transaction.getAmount() == 150.00) {
            TestUtils.printTestPassed("TransactionTest - getAmount()");
        } else {
            TestUtils.printTestFailed("TransactionTest - getAmount()");
        }
    }
}
