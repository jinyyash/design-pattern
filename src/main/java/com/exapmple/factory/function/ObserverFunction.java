package com.exapmple.factory.function;

public class ObserverFunction implements Function {
    @Override
    public void createFunction() {
        System.out.println("Observer function load");
    }
}
