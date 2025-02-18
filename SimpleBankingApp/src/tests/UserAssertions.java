package tests;

import model.User;
import utils.TestUtils;

public class UserAssertions {
    public static void main(String[] args) {
        testUserAssertions(); 
    }
    public static void testUserAssertions() {
        User user = new User("mark.smith@gmail.com", "mypass", "Mark", "Smith", "07711223344");

        assert user.getUsername().equals("mark.smith@gmail.com");
        assert user.getPassword().equals("mypass");
        assert user.getFirstName().equals("Mark");
        assert user.getLastName().equals("Smith");
        assert user.getMobileNumber().equals("07711223344");

        TestUtils.printTestPassed("UserTest - Assertions Verified");
    }

    }



