package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

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
    public void testOddNumbersExterminatorNormalList (){
        int l =0;

        //Given
        ArrayList<Integer> testOddNumbersExterminatorNormalList  = new ArrayList();


        //When
        for (int i = 0; i < evenNumbers.size();i++){
            testOddNumbersExterminatorNormalList.add(evenNumbers.get(i));
        }

        //Then
        Assert.assertTrue(testOddNumbersExterminatorNormalList.add( evenNumbers.get(l)) %2 == 0 );
        l++;
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        int k =0;

        //Given
        ArrayList<Integer>testOddNumbersExterminatorEmptyList = new ArrayList();


        //When
        for(int n = 0; n < 100000; n++){
            testOddNumbersExterminatorEmptyList.add(n);
            if (n % 2 == 0){
                testOddNumbersExterminatorEmptyList.add(n);
            }
        }
        //Then
        Assert.assertTrue(testOddNumbersExterminatorEmptyList.add( evenNumbers.get(k)) %2 == 0 );
        k++;
    }
}

