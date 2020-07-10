package com.flamey;

// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items:
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.

public class Hamburger
{
    private String name;
    private String breadRoll;
    private String meat;
    private Addition cheese;
    private Addition tomatoe;
    private Addition carrot;
    private Addition onion;

    private double basePrice;
    private double finalPrice;

    public Hamburger(String name, String breadRoll, String meat, double basePrice)
    {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        if(basePrice > 0 && basePrice < 10)
        {
            this.basePrice = basePrice;
        }
        else
        {
            this.basePrice = -1;
        }

        this.cheese = new Addition("lettuce", 0.15);
        this.tomatoe = new Addition("tomatoe", 0.20);
        this.carrot = new Addition("carrot", 0.20);
        this.onion = new Addition("onion", 0.10);
        this.finalPrice = basePrice;
    }

    public void addLettuce()
    {
        if(!cheese.isAdded())
        {
            cheese.add();
            System.out.printf("Lettuce added! Price of Hamburger increased by %.2f$\n", cheese.getPrice());
            this.finalPrice += cheese.getPrice();
        }
        else System.out.println("Lettuce already added!");

    }

    public void addTomatoe()
    {
        if(!tomatoe.isAdded())
        {
            tomatoe.add();
            System.out.printf("Tomatoe added! Price of Hamburger increased by %.2f$\n", tomatoe.getPrice());
            this.finalPrice += tomatoe.getPrice();
        }
        else System.out.println("Tomatoe already added!");
    }

    public void addOnion()
    {
        if(!onion.isAdded())
        {
            onion.add();
            System.out.printf("Onion added! Price of Hamburger increased by %.2f$\n", onion.getPrice());
            this.finalPrice += onion.getPrice();
        }
        else System.out.println("Onion already added!");
    }

    public void addCarrot()
    {
        if(!carrot.isAdded())
        {
            carrot.add();
            System.out.printf("Carrot added! Price of Hamburger increased by %.2f$\n", carrot.getPrice());
            this.finalPrice += carrot.getPrice();
        }
        else System.out.println("Carrot already added!");
    }

    public void addToFinalPrice(double addedPrice)
    {
        this.finalPrice += addedPrice;
    }

    public String getName()
    {
        return name;
    }

    public double getFinalPrice()
    {
        return finalPrice;
    }

    public String getBreadRoll()
    {
        return breadRoll;
    }

    public String getMeat()
    {
        return meat;
    }

    public Addition getLettuce()
    {
        return cheese;
    }

    public Addition getTomatoe()
    {
        return onion;
    }

    public Addition getCarrot()
    {
        return carrot;
    }

    public Addition getOnion()
    {
        return onion;
    }

    public double getBasePrice()
    {
        return basePrice;
    }
}
