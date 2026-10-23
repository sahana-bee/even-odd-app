package com.example;

public class EvenOddChecker {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        EvenOddChecker checker = new EvenOddChecker();
        int num = (args.length > 0) ? Integer.parseInt(args[0]) : 10;
        System.out.println("Number " + num + " is even? " + checker.isEven(num));
    }
}