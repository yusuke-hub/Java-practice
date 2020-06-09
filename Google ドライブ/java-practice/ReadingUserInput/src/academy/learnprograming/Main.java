package academy.learnprograming;

import java.util.Scanner;

// dump: コンピューターの記憶装置の内容を，プリンターやディスプレー装置などに出力すること。
public class Main {

    public static void main(String[] args) {
        // インスタンスについて
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        // hasNextInt
        // スキャナの入力内の次のトークンが
        // nexInt()メソッドを使ってデフォルト基数(0-9の整数値)のint値として解釈可能な場合、trueを返す
        // hasNextIntで入力待ちになっていて
        // そこで読み取ったトークンをそのまま次のnextInt()で渡している
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();
    }
}
