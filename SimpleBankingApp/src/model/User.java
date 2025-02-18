package model;

public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    public User(String username, String password, String firstName, String lastName, String mobileNumber) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMobileNumber() { return mobileNumber; }

    @Override
    public String toString() {
        return String.format("%-25s| %-15s| %-15s| %-15s| %-15s",
                username, password, firstName, lastName, mobileNumber);
    }
}

