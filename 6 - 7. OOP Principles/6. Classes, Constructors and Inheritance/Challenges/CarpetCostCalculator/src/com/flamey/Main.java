package com.flamey;

//The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms.
// To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet.
// For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters.
// To cover the floor with a carpet that costs $8 per square meter would cost $960.

public class Main {

    public static void main(String[] args)
    {
        Floor floor = new Floor(10, 12);
        Carpet carpet = new Carpet(8);

        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("$" + calculator.getTotalCost());
    }
}
