package academy.learnprograming;

public class Vehicle {
//    ★ Solution Example
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop() {
        this.currentVelocity = 0;
    }
    //    private String gear = "P";
//    private int speed = 0;
//
//    public String getGear() {
//        return gear;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setGear(String gear) {
//        this.gear = gear;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//
//    public void handSteering() {
//        System.out.println("Vehicle.handSteering() method called.");
//    }
//    public void changeGear(String gear) {
//        System.out.println("Vehicle.changeGear() method called");
//    }
//    public void move(int speed) {
//        System.out.println("Vehicle.move() method called Vehicle is moving at ");
//    }
}
