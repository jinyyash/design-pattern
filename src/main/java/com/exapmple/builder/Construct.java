package com.exapmple.builder;

public class Construct {
    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilderImpl();
        User user = userBuilder.age(1).name("jinadee","yasiruka").build();
        System.out.println(user.getFirsrName());
        System.out.println(user.getAge());
        System.out.println(user.getAddress());
    }
}
