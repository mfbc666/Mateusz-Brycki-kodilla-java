package com.kodilla.stream.World;

import java.util.ArrayList;
import java.util.List;

public final class World  {

    public List<Continent> continentList = new ArrayList<>();

    public void addContinent(Continent continent){
        continentList.add(continent);
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public Integer getNumberOfPeople() {
        return continentList.stream()
                .map(continent -> continent.getNumberofPeople())
                .reduce(0, (a, b) -> a + b);
    }
}


   /* public int getNumberofPeople(){
        return listContinentCountries.stream()
                .map( country -> country.getCountryPeopleQuantity())
                .reduce(0, (a, b) -> a + b);
    }
