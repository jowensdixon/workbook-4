package com.pluralsight;

public class Reservation {

        // Variables to store reservation details
        private String roomType;
        private int numberOfNights;
        private boolean isWeekend;

        // Constructor to set reservation values
        public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
            this.roomType = roomType.toLowerCase(); // "king" or "double"
            this.numberOfNights = numberOfNights;
            this.isWeekend = isWeekend;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType.toLowerCase();
        }

        public int getNumberOfNights() {
            return numberOfNights;
        }

        public void setNumberOfNights(int numberOfNights) {
            this.numberOfNights = numberOfNights;
        }

        public boolean isWeekend() {
            return isWeekend;
        }

        public void setIsWeekend(boolean isWeekend) {
            this.isWeekend = isWeekend;
        }

        // Calculate the price per night based on room type and weekend
        public double getPrice() {
            double price = 0;
            if (roomType.equals("king")) {
                price = 139.0;
            } else if (roomType.equals("double")) {
                price = 124.0;
            }

            // If it's a weekend, increase price by 10%
            if (isWeekend) {
                price = price * 1.10;
            }

            return price;
        }

        // Total cost = price per night * number of nights
        public double getReservationTotal() {
            return getPrice() * numberOfNights;
        }
    }


