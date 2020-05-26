package academy.learnprograming;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int value = 2;
	    if(value == 1){
            System.out.println("Value was 1");
        } else if(value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

	    // breakで実行中の処理を終了する
        // 最後の処理では自然に処理が終了するため、breakはなくても大丈夫だが、
        // 処理の終了を明示するためにはbreakは必要
        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("switchValue was 1");
                break;
            case 2:
                System.out.println("switchValue was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 , or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charValue = 'A';
        switch(charValue){
            case 'A':
                System.out.println("charValue is " + charValue);
                break;
            case 'B':
                System.out.println("charValue is B");
                break;
            case 'C':
                System.out.println("charValue is C");
                break;
            case 'D':
                System.out.println("charValue is D");
                break;
            case 'E':
                System.out.println("charValue is E");
                break;
            default:
                System.out.println("charValue is not found");
                break;
        }

        // リストから複数の要素を、ランダムに重複なく効率よく取り出す
        System.out.println("");
        List<Character> list = Arrays.asList('A', 'B', 'C', 'D');
        int charValue2 = new Random().nextInt(list.size());
        System.out.println("charValue is " + list.get(charValue2));

        
        System.out.println("");
        String month = "JANUARy";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
