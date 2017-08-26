package com.codecool;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<List> vehicles = createVehicles();
        List<Car> cars = vehicles.get(0);
        List<Truck> trucks = vehicles.get(1);
        List<Motorcycle> motorcycles = vehicles.get(2);

        simulateRace(cars, trucks, motorcycles);
        printRaceResults(cars, trucks, motorcycles);
    }

    private static void simulateRace(List<Car> cars, List<Truck> trucks, List<Motorcycle> motorcycles) {
        int lengthOfRace = 50;
        int numOfEachVehicles = 10;

        for (int i = 0; i < lengthOfRace; i++) {
            boolean raining = isRaining();
            for (int j = 0; j < numOfEachVehicles ; j++) {
                int limit = 70;

                Truck truck = trucks.get(j);
                Motorcycle motorcycle = motorcycles.get(j);
                Car car = cars.get(j);

                if (raining) {
                    car.setSpeedLimit(limit);
                    motorcycle.setSpeedLimit();
                }
                car.moveForAnHour();
                truck.moveForAnHour();
                motorcycle.moveForAnHour();
            }
        }
    }

    private static boolean isRaining() {
        int randomNumber = new Random().nextInt(100);
        boolean raining;

        if (randomNumber < 30) {
            raining = true;
        } else {
            raining = false;
        }

        return raining;
    }

    private static List<List> createVehicles() {
        int numberOfVehicles = 10;
        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();
        List<Motorcycle> motorcycles = new ArrayList<>();
        List<List> vehicles = new ArrayList<>();

        for (int i = 0; i < numberOfVehicles; i++) {
            Car car = new Car();
            Truck truck = new Truck();
            Motorcycle motorcycle = new Motorcycle();
            cars.add(car);
            trucks.add(truck);
            motorcycles.add(motorcycle);
        }

        vehicles.add(cars);
        vehicles.add(trucks);
        vehicles.add(motorcycles);

        return vehicles;
    }

    private static void printRaceResults(List<Car> cars, List<Truck> trucks, List<Motorcycle> motorcycles) {
        System.out.println("Results: ");
        for (Car car: cars) {
            System.out.printf("%s: %s - %d km\n", car.type, car.name(), car.distanceTraveled);
        }
        for (Truck truck: trucks) {
            System.out.printf("%s: %s - %d km\n", truck.type, truck.name, truck.distanceTraveled);
        }
        for (Motorcycle motorcycle: motorcycles) {
            System.out.printf("%s: %s - %d km\n", motorcycle.type, motorcycle.name(), motorcycle.distanceTraveled);
        }
    }
}