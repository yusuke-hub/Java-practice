package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
            int result = 4 + 5;
            System.out.println("4 + 5 = " + result);
            int previousResult = result;
            System.out.println("previousResult = " + previousResult);
            result = result - 5;
            System.out.println("9 - 5 = " + result);

            result = result * 12;
            System.out.println("4 * 12 = " + result);

            result = result / 4;
            System.out.println("48 / 4 = " + result);


            result = result % 5;  // the remainder : 剰余、余り
            System.out.println("12 % 5 = " + result);

            // abbreviation: 省略形
            result++;
            System.out.println("2 + 1 = " + result);

            result--;
            System.out.println("3 - 1 = " + result);

            result += 2;
            System.out.println("2 + 2 = " + result);

            result *= 10;
            System.out.println("4 * 10 = " + result);

            result /= 3;
            System.out.println("40 / 3 = " + result);

            result -= 2;
            System.out.println("13 - 2 = " + result);

            // if - then
            // 原則処理が１行の場合のみ
            // 条件式の後に、セミコロンをつけてしまうと
            // 条件式と処理が別々のコードと認識されてしまうので注意

            boolean isAlien = false;
            if(isAlien == false)
                System.out.println("It is not an alien!");

            // Code Block
            // 処理を{}で囲む
            // 実務においては、if - thenではなく、こちらが使われる
            // なぜならif - thenで書くと、将来的に処理を追加する時
            // やデバッグする時に面倒になるから
            if (isAlien == false){
                System.out.println("It is not an alien!");
                System.out.println("And I am scared of aliens");
            }

            int topScore1 = 100;
            if (topScore1 == 100) {
                System.out.println("You got the high score!");
            }
            if (topScore1 != 100) {
                System.out.println("You got the high score!");
            }

            int topScore2 = 80;
            if (topScore2 < 100) {
                System.out.println("You got the high score!");
            }

            int secondTopScore1 = 60;
            if (topScore2 > secondTopScore1 && topScore2 < 100) {
                System.out.println("Greater than second top score and less than 100");
            }

            // 条件式を並列させる場合は、他の人がぱっと見て
            // コードの内容を理解できるように()で囲むなどの配慮を忘れない
            int secondTopScore2 = 95;

            // && means AND, & calls ampersand.
            if ((topScore2 > secondTopScore2) && (topScore2 < 100)){
                System.out.println("Either of both of the conditions are true");
            }

            // || means OR, | calls pipe.
            if ((topScore2 > 90) || (secondTopScore2 <= 90)) {
                System.out.println();
            }

            int newValue = 50;
            // if (newValue = 50) { ← error
            if (newValue == 50) {
                System.out.println("This is true.");
            }

            boolean isCar = false;
            // if (isCar == true) { ← error
            // if (isCar = true) {


            // if (isCar != true) {
            // 以下省略形で書くことが推奨される
            // 割り当てオペレータを使う事によって、
            // 1,生じるエラーの可能性を避けることができる
            // 2,そして正確性が増す
            if (!isCar) {
                System.out.println("This is not supposed to happen.");
            }

            // 三項演算子
            // 例 int x = a ? b : c;
            // はじめにaを評価して
            // その評価値が真である時はbを評価して、その評価値を返し
            // 偽である時はcを評価して、その評価値を返す
            // bとcが返す評価値の型は、同じでなければならない
            boolean wasCar = isCar ? true : false;
            if (wasCar) {
                System.out.println("wasCar is true");
            }

            // == オペランド同士が等しいならば「true」を返す、比較演算子
            int ageOfClient = 20;
            boolean isEighteenOrOver = ageOfClient == 20 ? true : falese;
    }
 }

