package com.rutikkhedekar.assignment3;

public class Indigo implements Airfare {
    private int hours;
    private double costPerHour;

    // Default constructor
    public Indigo() {
        hours = 0;
        costPerHour = 0.0;
    }

    // Parameterized constructor
    public Indigo(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // Implementing calculateAmount method (multiplied by 8)
    @Override
    public double calculateAmount() {
        return 8 * hours * costPerHour;
    }

    // Implementing display method
    @Override
    public void display() {
        System.out.printf("Indigo - Hours: %d, Cost per hour: %.2f, Total Amount: %.2f%n", 
                          hours, costPerHour, calculateAmount());
    }
}
