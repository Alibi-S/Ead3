package com.example.lab4.location;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LocationService {
    Location location1 = new Location("l1", "Astana");
    Location location2 = new Location("l2", "Almaty");
    Location location3 = new Location("l3", "Budapest");

    List<Location> locations = Arrays.asList(location1, location2, location3);
    public List<Location> getAllLocations() {
        return locations;
    }
}
