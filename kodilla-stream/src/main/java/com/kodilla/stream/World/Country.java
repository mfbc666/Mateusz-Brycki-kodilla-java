package com.kodilla.stream.World;

import java.math.BigDecimal;
import java.util.Set;

public final class Country {
    private final String CountryName;
    private final int CountryPeopleQuantity;

    public Country(String countryName, int countryPeopleQuantity) {
        CountryName = countryName;
        CountryPeopleQuantity = countryPeopleQuantity;
    }

    public String getCountryName() {
        return CountryName;
    }

    public int getCountryPeopleQuantity() {
        return CountryPeopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "CountryName='" + CountryName + '\'' +
                ", CountryPeopleQuantity=" + CountryPeopleQuantity +
                '}';
    }
    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = new BigDecimal(CountryPeopleQuantity);
        return peopleQuantity;
    }

}



