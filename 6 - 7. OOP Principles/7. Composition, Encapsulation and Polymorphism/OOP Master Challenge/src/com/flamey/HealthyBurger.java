package com.flamey;

//Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).

public class HealthyBurger extends Hamburger
{
    private Addition cheese;
    private Addition cucumber;

    public HealthyBurger(String meat, double basePrice)
    {
        super("Healthy Burger", "Brown rye bread roll", meat, basePrice);

        this.cheese = new Addition("cheese", 0.50);
        this.cucumber = new Addition("cucumber", 0.20);
    }

    public void addCheese()
    {
        if(!cheese.isAdded())
        {
            cheese.add();
            System.out.printf("Cheese added! Price of Hamburger increased by %.2f$\n", cheese.getPrice());
            addToFinalPrice(cheese.getPrice());
        }
        else System.out.println("Cheese already added!");
    }

    public void addCucumber()
    {
        if(!cucumber.isAdded())
        {
            cucumber.add();
            System.out.printf("Cucumber added! Price of Hamburger increased by %.2f$\n", cucumber.getPrice());
            addToFinalPrice(cucumber.getPrice());
        }
        else System.out.println("Cucumber already added!");
    }

    public Addition getCheese()
    {
        return cheese;
    }

    public Addition getCucumber()
    {
        return cucumber;
    }
}
