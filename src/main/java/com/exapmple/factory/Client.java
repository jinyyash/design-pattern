package com.exapmple.factory;

import com.exapmple.factory.function.Function;
import com.exapmple.factory.view.View;

public class Client {
    public static void main(String[] args) {
        UserRole observerUser = new Observer();
        View view = observerUser.createView();
        Function function = observerUser.createFunction();

        view.createView();
        function.createFunction();
    }
}
