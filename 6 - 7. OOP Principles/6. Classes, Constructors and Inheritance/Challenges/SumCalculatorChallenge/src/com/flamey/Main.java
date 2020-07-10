package com.flamey;

public class Main {

    public static void main(String[] args)
    {
	    SumCalculator calculator = new SumCalculator();
	    calculator.setFirstNumber(5.0);
	    calculator.setSecondNumber(4);
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getDivisionResult());
        System.out.println(calculator.getMultiplicationResult());
        System.out.println(calculator.getSubtractionResult());
    }
}
