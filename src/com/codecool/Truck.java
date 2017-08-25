package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Truck {

    int breakdownTurnsLeft = 0;
    int name = getName();
    int distanceTraveled = 0;
    static List<Integer> usedNames = new ArrayList<>();

    int speed() {
        int speed = 100;
        int randomNum = new Random().nextInt(100);
        int breakDownChance = 5;
        if (randomNum < breakDownChance) {
            breakdownTurnsLeft = 1;
            speed = 0;
        }
        return speed;
    }

    int getName() {
        boolean nameExist = true;
        int newName = 1;
        while (nameExist) {
            int randomNum1to1000 = 1 + new Random().nextInt(1000);
            newName = randomNum1to1000;
            if (!usedNames.contains(newName)) {
                usedNames.add(newName);
                nameExist = false;
            }
        } return newName;
    }

    void moveForAnHour() {
        if (breakdownTurnsLeft != 0) {
            breakdownTurnsLeft--;
        } else {
            distanceTraveled += speed();
        }
    }
}