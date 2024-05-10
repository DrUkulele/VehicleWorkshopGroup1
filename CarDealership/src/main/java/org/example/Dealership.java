package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dealership {
    //properties
    private String name;
    private String address;
    private String phone;

    List<Vehicle> inventory = new ArrayList<>();

    //constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(List<Vehicle> inventory) {
        this.inventory = inventory;
    }

    //methods
    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        // Sort the inventory list by price (ascending order)
        Collections.sort(inventory, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle v1, Vehicle v2) {
                return Double.compare(v1.getPrice(), v2.getPrice());
            }
        });

        // Initialize the list to store vehicles within the price range
        List<Vehicle> vehiclesByPrice = new ArrayList<>();

        // Iterate through the sorted inventory list
        for (Vehicle vehicle : inventory) {
            double price = vehicle.getPrice();
            if (price >= min && price <= max) {
                // Add the vehicle to the list if its price falls within the range
                vehiclesByPrice.add(vehicle);
            }
        }

        return vehiclesByPrice;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make,String model){
        throw new UnsupportedOperationException();
    }
    public List<Vehicle> getVehiclesByYear(int min, int max){
        throw new UnsupportedOperationException();
    }
    public List<Vehicle> getVehiclesByColor(String color){
        throw new UnsupportedOperationException();
    }
    public List<Vehicle> getVehiclesByMileage(int min, int max){
        throw new UnsupportedOperationException();
    }
    public List<Vehicle> getVehiclesByType(String vehicleType){
        throw new UnsupportedOperationException();
    }
    public List<Vehicle> getAllVehicles(){
        throw new UnsupportedOperationException();
    }
    public void addVehicle(Vehicle vehicle){
        throw new UnsupportedOperationException();
    }
    public void removeVehicle(Vehicle vehicle){
        throw new UnsupportedOperationException();
    }
}
