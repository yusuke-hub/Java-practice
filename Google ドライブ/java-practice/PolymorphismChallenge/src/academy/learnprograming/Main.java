package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
    }

    public static class Car {
        private String name;
        int gears;
        private int cylinders;
        private int wheels;
        private boolean hasEngine;

        public Car(String name, int cylinders) {
            this.name = name;
            this.cylinders = cylinders;
            this.wheels = 4;
            this.hasEngine = true;
        }

        public String getName() {
            return name;
        }

        public int getCylinders() {
            return cylinders;
        }

        public int getWheels() {
            return wheels;
        }

        public boolean isHasEngine() {
            return hasEngine;
        }

        public String startEngine() {
            return "academy.learnprograming.Main.Car -> startEngine()";
        }

        public String accelerate() {
            return "academy.learnprograming.Main.Car -> accelerate()";
        }

        public String brake() {
            return "academy.learnprograming.Main.Car -> brake()";
        }
    }

    public static class Mitsubishi extends Car {
        public Mitsubishi(String name, int cylinders) {
            super(name, cylinders);
        }
    }
}
