package com.kodilla.exception.test;

import java.net.NoRouteToHostException;
import java.util.HashMap;
import java.util.Scanner;

public class AirportsCollector {
    public void departureAirportNameException(String departureAirport) throws Exception {
        try{
            departureAirport.equals(null);
        }catch(Exception RouteNotFoundException){
            System.out.println("Departure Airport name cannot be null");
        }

    }

    public static void main(String[] args) {
        HashMap<String, Boolean> airportMap = new HashMap<String, Boolean>();
        airportMap.put("Okęcie", true);
        airportMap.put("Wrocław", true);
        airportMap.put("Berlin", true);
        airportMap.put("Gdańsk", false);
        airportMap.put("Ustrzyki", true);
        airportMap.put("Nieznajowa", true);
        airportMap.put("Lwów", true);
        airportMap.put("Radom", false);

        AirportsCollector airportsCollector = new AirportsCollector();
        String departureAirport;

        String departureAirport = airportsCollector.departureAirportNameException();

    }
}

