package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        // 自分の回答
	    double myDouble1 = 20.00;
	    double myDouble2 = 80.00;
        boolean isDivisible = ((myDouble1 + myDouble2) * 100.00) % 40.00 == 0 ? true : false;
        System.out.println(isDivisible);
        if (!isDivisible)
            System.out.println("Got some remainder");

        // 模範回答
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
