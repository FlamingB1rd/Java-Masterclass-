package com.flamey;

//A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers,
//and i is a solution of the equation x2 = −1. Because no real number satisfies this equation, i is called an imaginary number.
//For the complex number a + bi, a is called the real part, and b is called the imaginary part.
//To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts.
//For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.
//


public class Main {

    public static void main(String[] args)
    {
        ComplexNumber complexNumber = new ComplexNumber(5, 3);
        complexNumber.add(4, 2);
        System.out.println(complexNumber.getReal() + " + " + complexNumber.getImaginary() + "i");

        ComplexNumber complexNumber1 = new ComplexNumber(3, 1);
        ComplexNumber complexNumber2 = new ComplexNumber(-1, 2);
        complexNumber1.add(complexNumber2);
        System.out.println(complexNumber1.getReal() + " + " + complexNumber1.getImaginary() + "i");
    }
}
