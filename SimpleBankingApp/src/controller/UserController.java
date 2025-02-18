package controller;

import model.User;

import java.util.Vector;

public class UserController {
    public static Vector<User> loadUserData() {
        Vector<User> users = new Vector<>();
        users.add(new User("mike", "my_passwd", "Mike", "Smith", "07771234567"));
        users.add(new User("james.cameron@gmail.com", "angel", "James", "Cameron", "07777654321"));
        users.add(new User("julia.roberts@gmail.com", "change_me", "Julia", "Roberts", "07770123456"));
        return users;
    }

    public static void printAllUsers(Vector<User> users) {
        System.out.println("Users in the system:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
