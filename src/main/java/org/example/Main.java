package org.example;

import org.example.daos.GenericDao;
import org.example.models.Location;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");
        GenericDao<Location, Long> locationDao = new GenericDao<>(Location.class);
        GenericService<Location, Long> locationService = new GenericService<>(locationDao);

        Location prague = new Location(14.421389, 50.0875, "Prague", "Czech Republic");
        locationService.save(prague);


    }
}