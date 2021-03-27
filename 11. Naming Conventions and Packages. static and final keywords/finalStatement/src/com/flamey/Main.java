package com.flamey;

public class Main {

    public static void main(String[] args)
    {
        SomeClass one = new SomeClass("One");
        SomeClass two = new SomeClass("Two");
        SomeClass three = new SomeClass("Three");

        // static final - for CONSTANTS

        // final Class - can't be subclassed

        // final method - can't be overriden

        // final field - can't be modified once initialized
        // (can be modified only once before the constructor is finished initializing).
        // Either when defining the field or in the constructor.
    }
}
