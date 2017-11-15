package com.kodilla.good.patterns.challenges;

public class MovieStream {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMoviesList().stream()
                .forEach(System.out::print) + "!";




    }
}
