package com.flamey;

//b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.

public class DeluxHamburger extends Hamburger
{
    private Addition chips;
    private Addition drinks;

    public DeluxHamburger(String breadRoll, String meat, double basePrice)
    {
        super("Delux Hamburger", breadRoll, meat, basePrice);
        this.chips = new Addition("Chips", 0.50);
        this.chips.add();
        System.out.printf("Chips added! Price of Hamburger increased by %.2f$\n", this.chips.getPrice());
        addToFinalPrice(this.chips.getPrice());

        this.drinks = new Addition("Drinks", 1.00);
        this.drinks.add();
        System.out.printf("Drinks added! Price of Hamburger increased by %.2f$\n", this.drinks.getPrice());
        addToFinalPrice(this.drinks.getPrice());
    }

    @Override
    public void addLettuce()
    {
        System.out.println("Cannot add lettuce to this hamburger.");
    }

    @Override
    public void addTomatoe()
    {
        System.out.println("Cannot add tomatoe to this hamburger.");
    }

    @Override
    public void addOnion()
    {
        System.out.println("Cannot add onion to this hamburger.");
    }

    @Override
    public void addCarrot()
    {
        System.out.println("Cannot add carrot to this hamburger.");
    }
}
