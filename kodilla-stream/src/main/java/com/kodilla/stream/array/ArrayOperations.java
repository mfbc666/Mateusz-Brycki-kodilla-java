package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static void getAverage(int[] numbers){
        List<Number> number = new ArrayList<>();

       IntStream.range(0,number.size()).forEach(
               nbr -> System.out.println(nbr)
       );
       IntStream intStream = IntStream.of(number.size());
       OptionalDouble average = intStream.average();
        System.out.println(average.orElse(-1));



    }
}
