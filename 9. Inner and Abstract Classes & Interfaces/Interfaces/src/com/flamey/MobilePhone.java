package com.flamey;

public class MobilePhone implements ITelephone
{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber)
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
        isOn = true;
        System.out.println("Mobile phone powered on");
    }

    @Override
    public void dial(int phoneNumber)
    {
        if(isOn) System.out.println("Now rining " + phoneNumber + " on mobile phone.");
        else System.out.println("Phone is switched off");
    }

    @Override
    public void answer()
    {
        if(isRinging)
        {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber)
    {
        if(myNumber == phoneNumber && isOn)
        {
            isRinging = true;
            System.out.println("Melody playing");
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
