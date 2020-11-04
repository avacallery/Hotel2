package com.avacallery;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Room {
    Scanner scanner = new Scanner(System.in);
    private String roomType;
    private boolean isOccupied;

    public Room(
            String roomType,
            boolean isOccupied) {
        this.roomType = roomType;
        this.isOccupied = isOccupied;
    }


    public void checkIn() {
        System.out.println("Enter name for reservation: ");
        String input = scanner.nextLine();
        System.out.println("Enter room type (Standard, Premium, Deluxe): ");
        roomType = scanner.nextLine();
        isOccupied = true;
        System.out.println("Thank you, " + input + ", for choosing the " + roomType + " room.");
    }

    public void checkOut() {
        System.out.println("Thank you for choosing AVA Hotels");
        isOccupied = false;
    }



}
