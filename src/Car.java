import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Car {

//    private Car() {
//        int normalSpeed = 110 - new Random().nextInt(31);
//    }



//    private static int setSpeedLimit(int limit) {
//
//    }

    String name() {
        List<String> carNamesList = Arrays.asList("Legend", "Union", "Dawn", "Storm", "Falcon", "Purity", "Whirlpool",
                                                    "Eternity", "Ferocity", "Aura","Prestige", "Astral", "Buffalo",
                                                    "Mythic", "Reach", "Legend", "Shadow", "Dynamics", "Oracle", "Silver");
        int numOfCarNames = 20;
        int firstIndex = new Random().nextInt(numOfCarNames);
        int secondIndex = new Random().nextInt(numOfCarNames);
        String firstName = carNamesList.get(firstIndex);
        String secondName = carNamesList.get(secondIndex);
        String name = firstName + secondName;
        return name;
    }

    int distanceTraveled = 0;

    void moveForAnHour() {
        distanceTraveled += new Random().nextInt(100);
    }

}

// lekezelni h semelyik gépnek ne legyen azonos neve
// moveforanhour növeli a distancet de az meg a currentet tárolja?
//// Since cars are so fast there is a 30% chance that they can go only with 70km/h speed.esőben
//static setSpeedLimit(int limit) // Call this from the Main class!
//        normalSpeed // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
//moveForAnHour. Call this from the main class only!