package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Car {

    int normalSpeed;
    static int limitedSpeed = 0;
    int distanceTraveled = 0;
    static List<String> usedNames = new ArrayList<>();

    Car() {
        this.normalSpeed = setSpeed();
    }

    static void setSpeedLimit(int limit) {
        limitedSpeed = limit;
    }

    String name() {
        List<String> carNamesList = Arrays.asList("Legend", "Union", "Dawn", "Storm", "Falcon", "Purity", "Whirlpool",
                                                    "Eternity", "Ferocity", "Aura","Prestige", "Astral", "Buffalo",
                                                    "Mythic", "Reach", "Legend", "Shadow", "Dynamics", "Oracle", "Silver");
        int numOfCarNames = 20;
        int firstIndex = 0;
        int secondIndex = 0;
        boolean nameExist = true;
        String name = "";
        while (nameExist) {
            while (firstIndex == secondIndex) {
                firstIndex = new Random().nextInt(numOfCarNames);
                secondIndex = new Random().nextInt(numOfCarNames);
            }
            String firstName = carNamesList.get(firstIndex);
            String secondName = carNamesList.get(secondIndex);
            name = firstName + ' ' + secondName;
            if (!usedNames.contains(name)) {
                usedNames.add(name);
                nameExist = false;
            }
        }
        return name;
    }

    private int setSpeed() {
        int maxSpeed = 110;
        int minSpeed = 80;
        int speedChange = new Random().nextInt(maxSpeed-minSpeed+1);
        int speed = maxSpeed -speedChange;
        return speed;
    }

    void moveForAnHour() {
        if (limitedSpeed > 0) {
            normalSpeed = limitedSpeed;
        }
        distanceTraveled += normalSpeed;
    }

}
