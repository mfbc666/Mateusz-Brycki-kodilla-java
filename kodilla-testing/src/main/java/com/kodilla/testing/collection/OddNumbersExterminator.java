package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;


class OddNumbersExterminator {
    public ArrayList<Integer> evenNumbers(List<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }
        return evenNumbers;
    }
}






