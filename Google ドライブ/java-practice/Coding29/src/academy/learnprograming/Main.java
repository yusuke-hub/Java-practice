package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(12);
        simpleCalculator.setSecondNumber(3);
        System.out.println("First number is " + simpleCalculator.getFirstNumber());
        System.out.println("Second number is " + simpleCalculator.getSecondNumber());
        System.out.println("First number + Second number = " + simpleCalculator.getAdditionResult());
        System.out.println("First number - Second number = " + simpleCalculator.getSubstractionResult());
        System.out.println("First number * Second number = " + simpleCalculator.getMultiplicationResult());
        System.out.println("First number / Second number = " + simpleCalculator.getDivisionResult());


    }
}
