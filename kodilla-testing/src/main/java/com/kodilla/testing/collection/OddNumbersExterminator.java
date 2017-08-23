package com.kodilla.testing.collection;

import java.util.ArrayList;

class OddNumbersExterminator {
    private ArrayList<Integer> evenNumbers() {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int n = 0; n < 100000; n++){
            if (n % 2 == 0){
                evenNumbers.add(n);
            }
        }
        return evenNumbers;
    }
    public void setEvenNumbers(ArrayList evenNumbers){
        this.evenNumbers();
    }
    public ArrayList getArraylist(){
        return evenNumbers();
    }

}




