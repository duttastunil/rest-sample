package com.sunil.test.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Customer {

    @NotNull(message = "Please provide first Name")
    private String firstName;

    @NotNull(message = "Please provide last Name")
    private String lastName;

    @NotNull
    @Min(value = 18, message = "Age should be equal or more than 18")
    private int age;

    @Email(message = "Please provide valid email address")
    private String email;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
