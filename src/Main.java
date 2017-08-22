

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    }

    private void simulateRace() {
        boolean raining = isRaining();
        List<List> vehicles = createVehicles();
        int lengthOfRace = 50;
        int numOfEachVehicles = 10;
        List<Car> cars = vehicles.get(0);
        List<Truck> trucks = vehicles.get(1);
        List<Motorcycle> motorcycles = vehicles.get(2);

        for (int i = 0; i < lengthOfRace; i++) {
            for (int j = 0; j < numOfEachVehicles ; j++) {
                Car car = cars.get(i);
                car.moveForAnHour();
                Truck truck = trucks.get(i);
                truck.moveForAnHour();
                Motorcycle motorcycle = motorcycles.get(i);
                motorcycle.moveForAnHour(raining);
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
        List<String> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();
        List<Motorcycle> motorcycles = new ArrayList<>();
        List<List> vehicles = new ArrayList<>();

        for (int i = 0; i < numberOfVehicles; i++) {
            Car car = new Car();
            Truck truck = new Truck();
            Motorcycle motorcycle = new Motorcycle();
            cars.add(car.name());
            trucks.add(truck);
            motorcycles.add(motorcycle);
        }

        vehicles.add(cars);
        vehicles.add(trucks);
        vehicles.add(motorcycles);

        return vehicles;
    }

//    private static void printRaceResults(List<List> vehicles) {
//        System.out.println("Results: ");
//        List<Car> cars =
//
//        for (int i = 0; i < vehicles.size(); i++) {
//            List<Object> vehicleGroup = vehicles.get(i);
//            for (int j = 0; j < 10; j++) {
//                vehicleGroup.get(i).name;
//            }
//        }
//        System.out.println();
//    }
}

//createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
//simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
//printRaceResults() // prints each vehicle's name, distance traveled ant type.

//As a guideline here are the classes you will need to create and some of their functions/properties. Note that this is just a skeleton, feel free to add more methods/variables. But you must implement the ones described here!