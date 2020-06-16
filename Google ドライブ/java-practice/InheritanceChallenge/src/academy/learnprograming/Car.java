package academy.learnprograming;

public class Car extends Vehicle {
    // ★ Another Solution
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
    }



    //
//    @Override
//    public void changeGear(String gear) {
//        this.setGear(gear);
//        switch(gear) {
//            case "OD":
//                this.setSpeed(100);
//                break;
//            case "D":
//                this.setSpeed(60);
//                break;
//            case "S":
//                this.setSpeed(40);
//                break;
//            case "L":
//                this.setSpeed(30);
//                break;
//            case "N":
//                this.setSpeed(0);
//                break;
//            default:
//                System.out.println("エラー");
//        }
//
////        if(gear.equals("OD")) {
////            this.setSpeed(100);
////        } else if(gear.equals("D")) {
////            this.setSpeed(60);
////        } else if(gear.equals("S")) {
////            this.setSpeed(40);
////        } else if(gear.equals("L")) {
////            this.setSpeed(30);
////        } else if(gear.equals("N")) {
////            this.setSpeed(0);
////        } else {
////            System.out.println("このギアは存在しません");
////        }
//    }
//
//    @Override
//    public void move(int speed) {
//        this.setSpeed(speed);
//        switch(speed) {
//            case 100:
//                this.setGear("OD");
//                break;
//            case 60:
//                this.setGear("D");
//                break;
//            case 40:
//                this.setGear("S");
//                break;
//            case 30:
//                this.setGear("L");
//                break;
//            case 0:
//                this.setGear("N");
//                break;
//            default:
//                System.out.println("エラー");
//                break;
//        }
//        super.move(speed);
//
//
//    }
}
