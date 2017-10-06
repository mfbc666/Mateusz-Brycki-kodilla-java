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
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Iterator eachNumber = numbers.iterator();
        int k = (Integer)eachNumber.next();
        ArrayList<Integer> evenNumbers = new ArrayList();
        for ( int l = 0; l < numbers.size();l++){
            if(k % 2 == 0){
                evenNumbers.add(k);
            }
        }

        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //Then
        Assert.assertEquals(numbers, evenNumbers);

    }

}