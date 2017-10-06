package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Begin : Test of Odd number exterminate engine");
    }

    @After
    public void after(){
        System.out.println("End : Test of Odd number exterminate engine");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList (){

        //Given
        ArrayList<Integer> numbers  = new ArrayList();
        ArrayList<Integer> expectedResult  = new ArrayList();
        for (int i = 0; i < 10; i++){
            numbers.add(i);
            if(i%2==0) {
                expectedResult.add(i);
            }
        }

        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = oddNumbersExterminator.evenNumbers(numbers);

        //Then
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testOddNumbersExterminatorFilledList (){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> resultList = oddNumbersExterminator.evenNumbers(numbers);

        //Then
        Assert.assertEquals(0, resultList.size());
    }
}