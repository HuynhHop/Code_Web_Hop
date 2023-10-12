package murach.business;

import java.io.Serializable;

public class User_ch05_ex1 implements Serializable {

    private String firstName;
    private String lastName;
    private String email;

    public User_ch05_ex1() {
        firstName = "";
        lastName = "";
        email = "";
    }

    public User_ch05_ex1(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
