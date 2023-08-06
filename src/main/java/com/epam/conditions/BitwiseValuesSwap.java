package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        first = second ^ first;
        second = first ^ second;
        first = first ^ second;
    }

}
