package com.exapmple.builder;

public class UserBuilderImpl implements UserBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public UserBuilder name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    //Return the finally consrcuted User object
    public User build() {
        User user = new User(this);
        return user;
    }
}
