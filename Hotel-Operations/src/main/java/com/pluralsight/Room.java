package com.pluralsight;

public class Room {
    // Variables to store room information
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // Constructor to set initial values
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    // Get how many beds the room has
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    // Get the price of the room
    public double getPrice() {
        return price;
    }

    // Check if the room is occupied
    public boolean isOccupied() {
        return occupied;
    }

    // Check if the room is dirty
    public boolean isDirty() {
        return dirty;
    }

    // A room is available only if it's clean and not occupied
    public boolean isAvailable() {
        return !occupied && !dirty;
    }
}

