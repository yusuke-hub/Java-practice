package academy.learnprograming;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        boolean gameOver;
        int score;
        int levelCompleted;
        int bonus;
        calculateScore2(true, 800, 5, 100);
        calculateScore2(false, 10000, 8, 200);



//        ★ 模範回答
//        int highScorePosition = calculateHighScorePosition(1500);
//        displayHighScorePosition("Tim", highScorePosition);
//        highScorePosition = calculateHighScorePosition(900);
//        displayHighScorePosition("Bob",highScorePosition);
//        highScorePosition = calculateHighScorePosition(400);
//        displayHighScorePosition("Percy",highScorePosition);
//        highScorePosition = calculateHighScorePosition(50);
//        displayHighScorePosition("Gilbert",highScorePosition);
//        highScorePosition = calculateHighScorePosition(1000);
//        displayHighScorePosition("Louise",highScorePosition);

        // ◯ 自分の回答 模範回答を元に、工夫をしてみた
        int playersScore[] = {1500, 900, 400, 50, 1000};
        String playersName[] = {"Tim", "Bob", "Percy", "Gilbert", "Louise"};
        int i;
        for (i = 0; i < 5; i++) {
            // ２つの配列のi番目を取り出して、それぞれ変数を宣言
            // それらを引数に入れてみたが、エラーが出た
            // なので直接ぶっ込んでみた
            // 一応成功した 
            displayHighScorePosition(playersName[i], calculateHighScorePosition(playersScore[i]));
        }

//        Javaでハッシュを作るのって、こんな難しいのか？？
//        そんなはずはないと思うが。。(笑)
//        Map<String, String> map = new HashMap<String, String>() {
//            {
//                put("samurai", "侍");
//                put("engineer", "エンジニア");
//            }
//        };
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore <= 500) {
            return 3;
        } else {
            return 4;
        }
    }

    // method
    // void(= empty, vacant):空
    // 返り値がない
    // 値を引数として、methodに渡す
    public static void calculateScore1(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    // 返り値を設定する場合は、値のデータ型を記述する
    public static int calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
        // -1という数字が示す物
        // エラー、値が不適当、値が見つからない
        return -1;
    }

//    ◯ 自分の回答
//        [Mainメソッド内]
//        int scores[] = {1500, 900, 400, 50};
//        displayHighScorePosition("Yusuke", "Champion");
//        for (int i = 0; i < 4; i++) {
//            なぜ返り値が来なかったんだろう。。
//            calculateHighScorePosition(scores[i]);
//        }
//    --------------------------------------------------------------------------------------
//    public static void displayHighScorePosition(String playersName, String position) {
//        System.out.println(playersName + " managed to get into position");
//        System.out.println(position + " on the high score table");
//    }
//
//    public static int calculateHighScorePosition(int score) {
//        if (score > 1000) {
//            return 1;
//        } else if(score > 500 && score < 1000) {
//            return 2;
//        } else if (score > 100 && score < 500) {
//            return 3;
//        } else {
//            return 4;
//        }
//    }

}
