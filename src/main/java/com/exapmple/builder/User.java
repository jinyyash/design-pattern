package com.exapmple.builder;

public class User {
    private String firsrName;
    private String lastName;
    private int age;
    private String address;

    public User(UserBuilderImpl builder) {
        this.firsrName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
        this.address = builder.getAddress();
    }

    public String getFirsrName() {
        return firsrName;
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
}
