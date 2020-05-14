package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String型
        // MAX_VALUE : 2.14billion
        // 1度変数を宣言したら、値が変わることはない
        String myString = "This is a string";
        System.out.println("myString is equal to" + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        // JavaはString型にInt型を追加しようとすると、Int型をString型として認識する
        // このやり方は非効率的
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

    }
}
