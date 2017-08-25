package com.codecool;

import java.util.Random;

public class Motorcycle {

    static int nameNumber = 1;
    int distanceTraveled = 0;
    int speed = 100;

    void setSpeedLimit() {
        int minSpeedDecrease = 5;
        int maxSpeedDecrease = 45;
        int speedDecrease = minSpeedDecrease + new Random().nextInt(maxSpeedDecrease + 1);
        speed -= speedDecrease;
    }

    String name() {
        String name = "Motorcycle " + nameNumber;
        nameNumber++;
        return name;
    }

    void moveForAnHour() {
        distanceTraveled += speed;
    }
}