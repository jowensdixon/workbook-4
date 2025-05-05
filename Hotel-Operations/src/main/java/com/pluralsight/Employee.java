package com.pluralsight;

import javax.lang.model.element.Name;

public class Employee {

        // Variables to store employee details
        private int employeeId;
        private String name;
        private String department;
        private double payRate;
        private double hoursWorked;

        // Constructor to set employee details
        public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
            this.employeeId = employeeId;
            this.name = name;
            this.department = department;
            this.payRate = payRate;
            this.hoursWorked = hoursWorked;
        }

        // Regular hours are up to 40
        public double getRegularHours() {
            return Math.min(hoursWorked, 40);
        }

        // Overtime is anything over 40 hours
        public double getOvertimeHours() {
            return Math.max(0, hoursWorked - 40);
        }

        // Total pay = regular pay + overtime pay (1.5x pay rate)
        public double getTotalPay() {
            double regularPay = getRegularHours() * payRate;
            double overtimePay = getOvertimeHours() * payRate * 1.5;
            return regularPay + overtimePay;
        }

        public String getName() {

            return "";
        }

    }



