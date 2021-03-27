package com.flamey;

public class ScopeCheck
{
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck()
    {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + "; privateVar = " + varOne);
    }

    public int getVarOne()
    {
        return  this.varOne;
    }

    public void timesTwo()
    {
        int varTwo = 2;
        for(int i=0; i<10; i++)
        {
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public void useInner()
    {
        //Scope and Visibility are different
        //this method showcases that difference
        //varThree's scope doesn't extend to the outer class, shown by us still using InnerClass.
        //but it's visibility (access modifiers being the deciding factor) is extended to the outer class despite varThree being private
        //Inner and Outer classes have full visibility of each other even with private access modifiers
        //But in terms of scope, the Inner class can use the Outer class' variables
        //while the Outer class can't use the Inner class' variable without instantiating it.
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }


    public class InnerClass
    {
        private int varThree = 3;

        public InnerClass()
        {
            System.out.println("InnerClass created, varOne = " + varOne + "; varThree = " + varThree);
        }

        public void timesTwo()
        {
            System.out.println("varOne is still available here " + varOne);
            for(int i=0; i<10; i++)
            {
                System.out.println(i + " times three is " + i * varThree);
            }
        }
    }
}
