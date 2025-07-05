/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas20250623;

/**
 *
 * @author LENOVO
 */
public class Author {
    private String name;
    private String email;

    // Constructor
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setter for email only (if needed)
    public void setEmail(String email) {
        this.email = email;
    }

    // toString
    public String toString() {
        return name + "'s Email is " + email;
    }
}
