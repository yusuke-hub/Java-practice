package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float Maximum value = " + myMaxFloatValue);
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double Maximum value = " + myMaxDoubleValue);


        int myIntValue = 5;
        // floatよりdoubleがよく使われる
        // (float) 数字 / 数字f
        // どちらでも良いけど、後者の方が簡単
        float myFloatValue = (float)5.25;
        double myDoubleValue = 5.25d;
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);
    }
}
