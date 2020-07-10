package com.flamey;

public class Main {

    public static void main(String[] args)
    {
        Cylinder cylinder = new Cylinder(2, 5);
        System.out.printf("%.2f \n",cylinder.getVolume());
        System.out.printf("%.2f",cylinder.getArea());
    }
}
