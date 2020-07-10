package com.flamey;

public class Main
{
    public static void main(String[] args)
    {
//        ITelephone myPhone = new ITelephone()  - We can't do it this way
        ITelephone myPhone = new DeskPhone(12185421);
        DeskPhone test = new DeskPhone(1234);
        myPhone.powerOn();
        myPhone.callPhone(12185421);
        myPhone.answer();
//      myPhone.test() - We can't do this
//      The Interface allows us to store in it ALL the classes that have implemented
//      it but it will only have the functionality we have declared in the
//      interface, not the class = meaning we only get the Overloaded
//      methods. This is a way of restricting access.
        test.test();

//      Testing - ITelephone can hold both different objects
//      Since they both implement it
        myPhone = new MobilePhone(12345);
        myPhone.powerOn();
        myPhone.callPhone(12345);
        myPhone.answer();
    }
}
