package com.kodilla.stream.World;

import java.util.ArrayList;
import java.util.List;

public final class World  {

    public List<Continent> continentList = new ArrayList<>();

    public void addContinent(Continent continent){
        continentList.add(continent);
    }

}



