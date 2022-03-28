package com.exapmple.factory;

import com.exapmple.factory.function.ForecastFunction;
import com.exapmple.factory.function.Function;
import com.exapmple.factory.view.ObserverView;
import com.exapmple.factory.view.View;

public class Observer implements UserRole {
    private final View view = new ObserverView();
    private final Function function = new ForecastFunction();

    @Override
    public View createView() {
        System.out.println("getting observer view");
        return view;
    }

    @Override
    public Function createFunction() {
        System.out.println("getting observer function");
        return function;
    }
}
