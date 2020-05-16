package academy.learnprograming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        // このように新しく変数を宣言せずとも、既存の変数を再利用して
        // 再定義することで、メモリを効率的に使用することができる
        // 「我々人間はミスをする」
        // これを自覚し、バグを誘発したり、その発見を妨げてしまう
        // コードの重複はできるだけ避けるよう、心がける
        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your second score was " + finalScore);
        }


        public static void calculateScore () {
            boolean gameOver = true;
            int score = 800;
            int levelCompleted = 5;
            int bonus = 100;
            if (score < 5000 && score > 1000) {
                System.out.println("Your score was less than 5000 but greater than 1000");
            } else if (score < 1000) {
                System.out.println("Your score was less than 1000");
            } else {
                System.out.println("Got here");
            }

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 1000;
                System.out.println("Your final score was " + finalScore);
            }
        }

    }
}
