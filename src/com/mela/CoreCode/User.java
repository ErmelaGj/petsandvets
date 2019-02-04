
package com.mela.CoreCode;

public class User{

    private String name, surname, badgeID, password, username;

    public User(String name, String surname, String badgeID, String password, String username) {
        this.name = name;
        this.surname = surname;
        this.badgeID = badgeID;
        this.password = password;
        this.username = username;
    }
        
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBadgeID() {
        return badgeID;
    }

    public void setBadgeID(String badgeID) {
        this.badgeID= badgeID;
    }
    
    
 @Override
    public String toString() {
        return "User{" + "name=" + name + ", surname=" + surname + ", badgeID=" + badgeID + ", password=" + password + '}';
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
