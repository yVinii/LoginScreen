/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Testes;

import Classes.LoginScreen;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pichau
 */
public class LoginScreenTest {
    @Test
        public void testSuccesfullLogin(){
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.login("john", "password123"));
        }
        
        @Test
        public void testFailedLogin(){
        LoginScreen loginScreen = new LoginScreen();
        assertFalse(loginScreen.login("john", "wrongpassword"));
        }
        
        @Test
        public void testAddLogin(){
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.addUser("testuser","testpassword");
        assertTrue(loginScreen.login("testuser", "testpassword"));
        }
    
}
