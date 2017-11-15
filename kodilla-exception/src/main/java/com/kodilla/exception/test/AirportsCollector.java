package com.kodilla.exception.test;


import java.util.HashMap;
import java.util.Scanner;

public class AirportsCollector {

    public static HashMap<String, Boolean> getCollection() {
        HashMap<String, Boolean> airportMap = new HashMap<String, Boolean>();
        airportMap.put("Okęcie", true);
        airportMap.put("Wrocław", true);
        airportMap.put("Berlin", true);
        airportMap.put("Gdańsk", false);
        airportMap.put("Ustrzyki", true);
        airportMap.put("Nieznajowa", true);
        airportMap.put("Lwów", true);
        airportMap.put("Radom", false);
        return airportMap;
    }

    public static void main(String[] args) {
        String departure;
        String arrival;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please type departure airport");
        departure = scanner.nextLine();

        System.out.println("");

        System.out.println("please type departure airport");
        arrival = scanner.nextLine();

        if(getCollection().containsKey(departure)){
            System.out.println("Departure airport choosen");
        } else System.out.println("Departure airport not found");

        if(getCollection().containsKey(arrival)){
            System.out.println("Arrival airport choosen");
        } else {
            System.out.println("Arrival airport not found");
        }

        if(Boolean.TRUE.equals(getCollection().containsKey(arrival))){
            System.out.println("route available");
        } else {
            System.out.println("route not available");
        }

    }



}

