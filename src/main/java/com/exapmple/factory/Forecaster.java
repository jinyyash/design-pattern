package com.exapmple.factory;

import com.exapmple.factory.function.ForecastFunction;
import com.exapmple.factory.function.Function;
import com.exapmple.factory.view.ForecastView;
import com.exapmple.factory.view.View;

public class Forecaster implements UserRole {
    private final View view = new ForecastView();
    private final Function function = new ForecastFunction();

    @Override
    public View createView() {
        System.out.println("getting Forecaster view");
        return view;
    }

    @Override
    public Function createFunction() {
        System.out.println("creating Forecaster function");
        return function;
    }
}
