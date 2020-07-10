package com.flamey;

public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Yorkie");
        dog.breather();
        dog.eat();

        Parrot bird = new Parrot("Shlem");
        bird.breather();
        bird.eat();
        bird.fly();

        Penguin penguin = new Penguin("Hollie");
        penguin.breather();
        penguin.eat();
        penguin.fly();

    }
}
