package com.avacallery;

public class Main {

    public static void main(String[] args) {
	Room standardRoom = new Room("Standard", false);
	Room deluxeRoom = new Room("Deluxe", false);
	Room premiumRoom = new Room("Premium", false);

	standardRoom.checkIn();
    }
}
