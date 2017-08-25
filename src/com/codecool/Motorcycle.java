package com.codecool;

import java.util.Random;

public class Motorcycle {

    static int nameNumber = 1;
    int distanceTraveled = 0;

    int speed(boolean isRaining) {
        int speed = 100;
        if (isRaining) {
            int speedDecrease = 5 + new Random().nextInt(46);
            speed -= speedDecrease;
        }
        return speed;
    }

    String name() {
        String name = "com.codecool.Motorcycle " + nameNumber;
        nameNumber++;
        return name;
    }

    void moveForAnHour(boolean isRaining) {
        distanceTraveled += speed(isRaining);
    }
}

//isRaining jobb lenne constructornak?