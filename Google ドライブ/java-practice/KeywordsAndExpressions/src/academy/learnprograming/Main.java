package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        // Javaの予約語(53種類)は使えませんよ

        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;

            //上記でexpressionとして、当てはまる記述はどの部分か？
            // 自分の回答↓
            // score = 100
            // score > 99
            // score = 0

            // 模範回答
            // 自分の回答 + "You got the high score!"

            // statement
            // 複数のコードを1行に書いても、
            // スペースが10あっても、Javaは問題なく読み取ることはできるが
            // 読みにくい

            // whitespece
            // indentation
            int myVariable = 50;
        }
    }
}


