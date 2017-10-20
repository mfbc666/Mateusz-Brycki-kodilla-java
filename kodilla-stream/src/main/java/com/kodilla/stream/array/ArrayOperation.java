package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperation {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,3,2};

        IntStream.range(0, numbers.length).forEach(
                nbr -> System.out.println(numbers[nbr])
        );

        IntStream intStream = IntStream.of(numbers);
        OptionalDouble average = intStream.average();
        System.out.println(average.orElse(-1));

    }
}
