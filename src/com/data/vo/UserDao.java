package com.data.vo;

import java.util.Set;
import java.util.stream.Collectors;

public class UserDao {

    private String firstName;
    private String lastName;
    private String userAddre;
    private String userPhone;
    private String userPassword;
    private Set<String> names;

    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        Set <String> name = names.stream().filter(num -> num.startsWith("AN")).collect(Collectors.toSet());
        this.names = name;
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

    public String getUserAddre() {
        return userAddre;
    }

    public void setUserAddre(String userAddre) {
        this.userAddre = userAddre;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
