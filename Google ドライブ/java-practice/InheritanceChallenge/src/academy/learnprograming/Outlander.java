package academy.learnprograming;

public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int wheels, int doors, int gears, boolean isManual, int currentGear, int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
