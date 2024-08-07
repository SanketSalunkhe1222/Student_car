package com.jspiders.cardekhocasestudy.caroperations;

import java.util.ArrayList;

import com.jspiders.cardekhocasestudy.car.Car;

public class CarOperations {
	//Should contain methods for adding, removing, updating and retrieving a car
	
	ArrayList<Car> carList = new ArrayList<>(); 
	
	public void addCar(int id, String name, String brand, double price) {
        Car car = new Car(id, name, brand, price);
        carList.add(car);
        System.out.println("Car added successfully.");
    }
	
	public void removeCar(int id) {
        for (Car car : carList) {
            if (car.getId() == id) {
                carList.remove(car);
                System.out.println("Car removed successfully.");
                return;
            }
        }
        System.out.println("Car with ID " + id + " not found.");
    }
	
	public void updateCar(int id, String name, String brand, double price) {
        for (Car car : carList) {
            if (car.getId() == id) {
                carList.remove(car);
                carList.add(new Car(id, name, brand, price));
                System.out.println("Car updated successfully.");
                return;
            }
        }
        System.out.println("Car with ID " + id + " not found.");
    }
	
	
	 public void retrieveCar(int id) {
	        for (Car car : carList) {
	            if (car.getId() == id) {
	                System.out.println("Car ID: " + car.getId());
	                System.out.println("Name: " + car.getName());
	                System.out.println("Brand: " + car.getBrand());
	                System.out.println("Price: $" + car.getPrice());
	                return;
	            }
	        }
	        System.out.println("Car with ID " + id + " not found.");
	    }
}
