package com.codecool;

import java.util.Random;

public class Motorcycle {

    static int nameNumber = 1;
    int distanceTraveled = 0;
    int limitedSpeed = 0;
    int normalSpeed;
    String type = "Motorcycle";

    int speed() {
        normalSpeed = 100;
        return normalSpeed;
    }

    void setSpeedLimit() {
        int minSpeedDecrease = 5;
        int maxSpeedDecrease = 45;
        int speedDecrease = minSpeedDecrease + new Random().nextInt(maxSpeedDecrease + 1);
        limitedSpeed = normalSpeed - speedDecrease;
    }

    String name() {
        String name = "Motorcycle " + nameNumber;
        nameNumber++;
        return name;
    }

    void moveForAnHour() {
        if (limitedSpeed > 0) {
            distanceTraveled += limitedSpeed;
            limitedSpeed = 0;
        } else {
            distanceTraveled += speed();
        }
    }
}