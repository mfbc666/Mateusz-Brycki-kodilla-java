package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class MovieStore {
    List<Movie> movies = new ArrayList<>() {

        public MovieStore(){
            movies.add(new Movie("Iron Man","Żelazny Człowiek","IM"));
            movies.add(new Movie("Avengers","Mściciele", "AV"));
            movies.add(new Movie("Flash","Błyskawica","FL"));
        }
        public List<Movie> getMoviesList(){
            return new ArrayList<Movie>(movies);
        }

    }







}
