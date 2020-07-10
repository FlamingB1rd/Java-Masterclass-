package com.flamey;

public class Main {

    public static void main(String[] args)
    {
        Person person = new Person();
        person.setAge(13);
        person.setFirstName("");
        person.setLastName("");

        System.out.println(person.isTeen());
        System.out.println(person.getFullName());
    }
}
