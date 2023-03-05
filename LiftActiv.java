package HomeWork05032023;

import static HomeWork05032023.Lift.numberOfLifts;

public class LiftActiv {
    public static void main(String[] args) {
        int floors = 200;
        int stepUp = 50;
        int stepDown = 1;

        int lifts = numberOfLifts(floors, stepUp, stepDown);

        System.out.println("Количество подъемов: " + lifts);

    }
}
