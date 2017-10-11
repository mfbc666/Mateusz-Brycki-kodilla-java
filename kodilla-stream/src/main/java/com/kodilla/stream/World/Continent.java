package com.kodilla.stream.World;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    public static List<String> Australia(){
        final List<String> Australia = new ArrayList<>();
        Australia.add("Australia");

        return new ArrayList<String>(Australia);

    }
    public static List<String>Europa(){
        final List<String> Europa = new ArrayList<>();
        Europa.add("Poland");
        Europa.add("Germany");
        Europa.add("Netherlands");

        return new ArrayList<String>(Europa);

    }
    public static List<String>Asia(){
        final List<String>Asia = new ArrayList<>();
        Asia.add("Japan");
        Asia.add("China");
        Asia.add("Vietnam");

        return new ArrayList<String>(Asia);
    }

}
