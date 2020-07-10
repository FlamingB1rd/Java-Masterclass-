package com.flamey;

//One class can EXTEND only one class but it can
//IMPLEMENT indefinitely
public class DeskPhone implements ITelephone
{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber)
    {
        this.myNumber = myNumber;
    }

    public void test()
    {
        System.out.println("Testing...");
    }

    @Override
    public void powerOn()
    {
        System.out.println("No action taken, desk phone doesn't have a button to power on.");
    }

    @Override
    public void dial(int phoneNumber)
    {
        System.out.println("Now rining " + phoneNumber + " on desk phone.");
    }

    @Override
    public void answer()
    {
        if(isRinging)
        {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber)
    {
        if(myNumber == phoneNumber)
        {
            isRinging = true;
            System.out.println("Ring ring");
        }
        else
        {
            isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging()
    {
        return isRinging;
    }
}
