package com.exapmple.builder;

public interface UserBuilder {
    public UserBuilder name(String firstName, String lastName);

    public  UserBuilder age(int age);

    public UserBuilder address(String address);

    public User build();
}
