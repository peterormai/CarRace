import java.util.Random;

public class Truck {

    int breakdownTurnsLeft = 0;
    int name = 1 + new Random().nextInt(999);
    int distanceTraveled = 0;

    int speed() {
        int speed = 100;
        int randomNum = new Random().nextInt(100);
        int breakDownChance = 5;
        if (randomNum < breakDownChance) {
            breakdownTurnsLeft = 1;
            speed = 0;
        } return speed;
    }

    void moveForAnHour() {
        if (breakdownTurnsLeft != 0) {
            breakdownTurnsLeft--;
        } else {
            distanceTraveled += speed();
        }
    }
}