package tests;

import model.User;
import utils.TestUtils;

public class UserTest {
    public static void main(String[] args) {
        testUserGetters();
    }

    public static void testUserGetters() {
        User user = new User("john.doe@gmail.com", "securePass", "John", "Doe", "07712345678");

        if (user.getUsername().equals("john.doe@gmail.com")) {
            TestUtils.printTestPassed("UserTest - getUsername()");
        } else {
            TestUtils.printTestFailed("UserTest - getUsername()");
        }

        if (user.getFirstName().equals("John")) {
            TestUtils.printTestPassed("UserTest - getFirstName()");
        } else {
            TestUtils.printTestFailed("UserTest - getFirstName()");
        }

        if (user.getLastName().equals("Doe")) {
            TestUtils.printTestPassed("UserTest - getLastName()");
        } else {
            TestUtils.printTestFailed("UserTest - getLastName()");
        }

        if (user.getMobileNumber().equals("07712345678")) {
            TestUtils.printTestPassed("UserTest - getMobileNumber()");
        } else {
            TestUtils.printTestFailed("UserTest - getMobileNumber()");
        }
    }
}

