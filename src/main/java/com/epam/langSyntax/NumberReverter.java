package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        for (int i = number; i != 0; i /= 10) {
            System.out.print(i % 10);
        }
        System.out.println();
    }

}
