package Classes;

import java.util.HashMap;
import java.util.Map;

/**
 * A class representing a simple login screen with user authentication functionality.
 */
public class LoginScreen {
    private Map<String, String> userDatabase;

    /**
     * Initializes the login screen and populates the user database with default users.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Attempts to log in a user by verifying the provided username and password.
     *
     * @param username The username to be checked for authentication.
     * @param password The password associated with the username.
     * @return True if the username and password are valid, false otherwise.
     */
    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a new user to the user database with the specified username and password.
     *
     * @param username The username of the new user to be added.
     * @param password The password associated with the new user.
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
}