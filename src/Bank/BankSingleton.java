//Implement a BankSingleton class using the Singleton pattern
//to manage user accounts and ensure a single instance of the banking system.
//Implement a users list property

//Implement a createUser method in the BankSingleton class that takes a username
//and password and adds the new user to the list of users
//Implement a method in the BankSingleton class to authenticate users during sign-in.
//Use a simple username/password validation mechanism.

//Implement a method to allow users to create a bank account.
//Ensure the uniqueness of usernames.

//Implement a method to display account details for a signed-in user.

package Bank;
import java.util.ArrayList;
import java.util.List;

public class BankSingleton {
    private static BankSingleton instance;
    private List<User> users;

    private BankSingleton() {
        users = new ArrayList<User>();
    }

    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }

    public List<User> getUsers() {
        return users;
    }

    public User createUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                throw new IllegalArgumentException("Username already exists");
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
        System.out.println("User " + username + " created");
        return newUser;
    }

    public User authenticate(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            } else {
                System.out.println("User " + username + " not found");
            }
        }
        return null;
    }



}
