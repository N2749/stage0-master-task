package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("first");
            return;
        }
        if (x < 0 && y > 0) {
            System.out.println("second");
            return;
        }
        if (x < 0 && y < 0) {
            System.out.println("third");
            return;
        }
        if (x > 0 && y < 0) {
            System.out.println("fourth");
            return;
        }
        System.out.println("zero");
    }

}

