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

        // int型では小数点以下が表示されない
        int myIntValue = 5 / 3;
        // floatよりdoubleがよく使われる
        // (float) 数字 / 数字f
        // どちらでも良いけど、後者の方が簡単
        float myFloatValue = 5f / 3f;
        // Javaは全ての少数デフォルトでdouble型として扱う
        // double型の方が扱える範囲が広く、正確に小数点の計算ができる為
        // float型よりもdouble型の使用が推奨される
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        // 自分の回答
        int myWeight = 140;
        double kilogramme = myWeight * 0.45359237;
        System.out.println("チャレンジ");
        System.out.println("私の体重は" + kilogramme + "KGです");

        // 講義回答
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000_4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
