package com.function;

import java.util.function.Function;

public class GreetingFunction implements Function<String, String> {

    @Override
    public String apply(String name) {
        return "Welcome, " + name + " to your doom !";
    }
    
}
