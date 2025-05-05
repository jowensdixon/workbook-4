package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Test the Room class
        Room room1 = new Room(2, 150.00, false, false);
        System.out.println("Room has " + room1.getNumberOfBeds() + " beds.");
        System.out.println("Room price: $" + room1.getPrice());
        System.out.println("Is room available? " + room1.isAvailable());

        System.out.println();

        // Test the Reservation class
        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("Room type: " + reservation.getRoomType());
        System.out.println("Price per night: $" + reservation.getPrice());
        System.out.println("Total cost for reservation: $" + reservation.getReservationTotal());

        System.out.println();

        // Test the Employee class
        Employee employee = new Employee(101, "Alice", "Housekeeping", 15.50, 45);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Regular hours: " + employee.getRegularHours());
        System.out.println("Overtime hours: " + employee.getOvertimeHours());
        System.out.println("Total pay: $" + employee.getTotalPay());
    }
}

