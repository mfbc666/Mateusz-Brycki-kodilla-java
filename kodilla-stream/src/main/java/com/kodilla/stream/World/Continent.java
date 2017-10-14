package com.kodilla.stream.World;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    public List<Country> listContinentCountries = new ArrayList<>();

    public void addCountry(Country country){
        listContinentCountries.add(country);
    }

    public List<Country> getListContinentCountries() {
        return listContinentCountries;
    }
}


