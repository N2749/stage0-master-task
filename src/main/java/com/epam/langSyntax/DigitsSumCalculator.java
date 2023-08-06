package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        for (int i = number; i != 0; i /= 10) {
            sum += i / 10;
        }
        System.out.println(sum);
    }

}
