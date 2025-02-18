package tests;

import model.User;
import utils.TestUtils;

public class ConstructorTest {
    public static void main(String[] args) {
        testUserConstructor(); 
    }
    public static void testUserConstructor() {
        User user = new User("jane.doe@gmail.com", "pass123", "Jane", "Doe", "07776543210");

        if (user.getUsername().equals("jane.doe@gmail.com") &&
            user.getPassword().equals("pass123") &&
            user.getFirstName().equals("Jane") &&
            user.getLastName().equals("Doe") &&
            user.getMobileNumber().equals("07776543210")) {

            TestUtils.printTestPassed("UserTest - Constructor Test");
        } else {
            TestUtils.printTestFailed("UserTest - Constructor Test");
        }
    }
}
