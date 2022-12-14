package ch.bzz.hobbytinder.model;

import java.util.Date;
import java.util.UUID;

public class User {
    private UUID userUUID;
    private String name;
    private String firstname;
    private Date birthdate;
    private String email;
    private String password;


    public UUID getUserUUID() {
        return userUUID;
    }
    public void setUserUUDI(UUID userUUID){
        this.userUUID = userUUID;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(UUID userUUID, String name, String firstname, Date birthdate, String email, String password) {
        this.userUUID = userUUID;
        this.name = name;
        this.firstname = firstname;
        this.birthdate = birthdate;
        this.email = email;
        this.password = password;
    }

    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "userUUID=" + userUUID +
                ", name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthdate=" + birthdate +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
