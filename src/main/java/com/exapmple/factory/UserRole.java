package com.exapmple.factory;

import com.exapmple.factory.function.Function;
import com.exapmple.factory.view.View;

public interface UserRole {
    View createView();
    Function createFunction();
}
