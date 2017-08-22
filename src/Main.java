import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<List> vehicles = createVehicles();
        List<Car> cars = vehicles.get(0);
        List<Truck> trucks = vehicles.get(1);
        List<Motorcycle> motorcycles = vehicles.get(2);

        simulateRace(cars, trucks, motorcycles);

        printRaceResults(cars, trucks, motorcycles);

    }

    static void simulateRace(List<Car> cars, List<Truck> trucks, List<Motorcycle> motorcycles) {
        int lengthOfRace = 50;
        int numOfEachVehicles = 10;

        for (int i = 0; i < lengthOfRace; i++) {
            for (int j = 0; j < numOfEachVehicles ; j++) {
                boolean isRaining = isRaining();
                int limit = 70;
                Car car = cars.get(j);
                if (isRaining) {
                    car.setSpeedLimit(limit);
                }
                car.moveForAnHour();
                Truck truck = trucks.get(j);
                truck.moveForAnHour();
                Motorcycle motorcycle = motorcycles.get(j);
                motorcycle.moveForAnHour(isRaining);
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
            int carSpeed = 110 - new Random().nextInt(31);
            Car car = new Car(carSpeed);
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
            System.out.printf("Car: %s - %d km\n", car.name(), car.distanceTraveled);
        }
        for (Truck truck: trucks) {
            System.out.printf("Truck: %s - %d km\n", truck.name, truck.distanceTraveled);
        }
        for (Motorcycle motorcycle: motorcycles) {
            System.out.printf("Motorcycle: %s - %d km\n", motorcycle.name(), motorcycle.distanceTraveled);
        }
    }

}

//Csinálni egy ranglistát printelőt
//createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
//simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
//printRaceResults() // prints each vehicle's name, distance traveled ant type.

//As a guideline here are the classes you will need to create and some of their functions/properties. Note that this is just a skeleton, feel free to add more methods/variables. But you must implement the ones described here!