package com.kodilla;

import com.kodilla.testing.calculator.Calculator;

public class CalculatorTests {
    public static void main(String[] args) {
        //Zadanie zaliczeniowe 6.2

        Calculator calculator = new Calculator();
        System.out.println("");
        System.out.println("Excercise 6.2");
        System.out.println("");
        if(calculator.add(5,5) == 10){
            System.out.println("add passed");
        } else {
            System.out.println("Error!");
        }
        if(calculator.substract(5,5) == 0){
            System.out.println("substract passed");
        }else {
            System.out.println("Error!");
        }
    }
}
