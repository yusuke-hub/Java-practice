package academy.learnprograming;

public class Main {
    // cm = 2.54 * (feet * 12 + inch)
    // 1feet = 12inch = 25.08cm
    // 1inch = 2.54cm

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(10);
    }
    // my solution
//    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
//        if (feet >= 0 || (inches >= 0 && inches <= 12)){
//            return (int) (2.54 * (feet * 12 + inches));
//        }else {
//            return -1;
//        }
//    }
//    public static double calcFeetAndInchesToCentimeters(double inches){
//        if(inches >= 0){
//            return calcFeetAndInchesToCentimeters(inches / 12, inches);
//        }else {
//            return -1;
//        }
//    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || ((inches < 0) || (inches > 12))){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        // feet → inch → centimeter
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet, " + inches + "inches = " + centimeters + " cm");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + "feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }
}
