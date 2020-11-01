package com.avacallery;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms = new ArrayList<Room>();

    public Hotel(int numberOfRooms) {
        for (int count = 0; count < numberOfRooms; count++) {
            rooms.add(new Room());
        }
    }
}
