package com.flamey;

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car("true", "Base car", 7);
        car.accelerate();
        car.startEngine();
        car.usingBreaks();

        Porshe porshe = new Porshe("false", "Porshe model", 6);
        porshe.accelerate();
        porshe.startEngine();
        porshe.usingBreaks();

        Ford ford = new Ford("true", "Ford model", 5);
        ford.accelerate();
        ford.startEngine();
        ford.usingBreaks();

        Mitsubishi mitsubishi = new Mitsubishi("false", "Mitsubishi model", 6);
        mitsubishi.accelerate();
        mitsubishi.startEngine();
        mitsubishi.usingBreaks();
    }
}

class Car
{
    private String engine;
    private String model;
    private int cyliinders;
    private int wheels;

    public Car(String engine, String model, int cyliinders)
    {
        this.engine = engine;
        this.model = model;
        this.cyliinders = cyliinders;
        this.wheels = 4;
    }

    public void accelerate()
    {
        System.out.println("Car.accelerate() -> Accelerating...");
    }

    public void startEngine()
    {
        System.out.println("Car.startEngine -> Starting engine...");
    }

    public void usingBreaks()
    {
        System.out.println("Car.usingBreaks() -> Using breaks...");
    }

    public String getEngine()
    {
        return engine;
    }

    public String getModel()
    {
        return model;
    }

    public int getCyliinders()
    {
        return cyliinders;
    }

    public int getWheels()
    {
        return wheels;
    }
}

class Porshe extends Car
{
    public Porshe(String engine, String model, int cyliinders)
    {
        super(engine, model, cyliinders);
    }

    @Override
    public void accelerate()
    {
        System.out.println("Porshe.accelerate() -> Accelerating...");
    }

    @Override
    public void startEngine()
    {
        System.out.println("Porshe.startEngine() -> Starting Engine...");
    }

    @Override
    public void usingBreaks()
    {
        System.out.println("Porshe.usingBreaks() -> Using breaks...");
    }
}

class Mitsubishi extends Car
{
    public Mitsubishi(String engine, String model, int cyliinders)
    {
        super(engine, model, cyliinders);
    }

    @Override
    public void accelerate()
    {
        System.out.println("Mitsubishi.accelerate() -> Accelerating...");
    }

    @Override
    public void startEngine()
    {
        System.out.println("Mitsubishi.startEngine() -> Starting Engine...");
    }

    @Override
    public void usingBreaks()
    {
        System.out.println("Mitsubishi.usingBreaks() -> Using breaks...");
    }
}

class Ford extends Car
{
    public Ford(String engine, String model, int cyliinders)
    {
        super(engine, model, cyliinders);
    }

    @Override
    public void accelerate()
    {
        System.out.println("Ford.accelerate() -> Accelerating...");
    }

    @Override
    public void startEngine()
    {
        System.out.println("Ford.startEngine() -> Starting Engine...");
    }

    @Override
    public void usingBreaks()
    {
        System.out.println("Ford.usingBreaks() -> Using breaks...");
    }
}


