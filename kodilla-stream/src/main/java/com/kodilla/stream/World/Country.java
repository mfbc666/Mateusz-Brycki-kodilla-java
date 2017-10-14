package com.kodilla.stream.World;

import java.math.BigDecimal;
import java.util.Set;

public final class Country {
    private final String countryName;
    private final int countryPeopleQuantity;

    public Country(String countryName, int countryPeopleQuantity) {
        this.countryName = countryName;
        this.countryPeopleQuantity = countryPeopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryPeopleQuantity() {
        return countryPeopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "CountryName='" + countryName + '\'' +
                ", CountryPeopleQuantity=" + countryPeopleQuantity +
                '}';
    }
    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = new BigDecimal(countryPeopleQuantity);
        return peopleQuantity;
    }

}



