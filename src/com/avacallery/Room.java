package com.avacallery;

import java.util.Random;
import java.util.Scanner;


public class Room {
    Scanner scanner = new Scanner(System.in);

    private int number = 5;
    private String type;
    private boolean isOccupied;

    public Room() {
        this.number = number;
        this.type = type;
        this.isOccupied = false;
    }

    // I don't actually want a random room number but do not know how to make it so room number is a value between 1-5?

    public void roomNumber(Random random) {
        number = random.nextInt(number) + 1;
    }

    public int getRoomNumber() {
        return number;
    }

    public void checkIn(int name) {
        System.out.println("Enter name for reservation: ");
        String input = scanner.nextLine();

    }



}
