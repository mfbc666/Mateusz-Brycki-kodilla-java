package com.kodilla.good.patterns.challenges;

public class MovieStream {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMoviesList().stream()
                .forEach(movie -> System.out.print(movie.getEnglishTitle() + "!")); //to nie jest dobrze. podac jakąs zmienną, normalnie -> sout  + !




    }
}
