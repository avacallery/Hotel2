package com.avacallery;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;


    public Hotel(ArrayList<Room> rooms ) {
        this.rooms = rooms;
    }

    public ArrayList<Room> displayAllRooms() {
        return rooms;
    }
}
