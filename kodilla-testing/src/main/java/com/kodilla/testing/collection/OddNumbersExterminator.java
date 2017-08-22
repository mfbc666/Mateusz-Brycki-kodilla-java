package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        ArrayList<Integer>numbers=new ArrayList<Integer>();
        for(int n = 0; n < 100000; n++){
            numbers.add(n);
            if (n % 2 == 0){
                evenNumbers.add(n);
            }
        }
    }
}
