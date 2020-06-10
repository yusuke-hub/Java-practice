package academy.learnprograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int min = 0;
//        int max = 0;
//        int counter = 0;
//
//        while(true) {
//            counter++;
//            System.out.println("Enter number:");
//            boolean isAnInt = scanner.hasNextInt();
//            if(isAnInt){
//                int number = scanner.nextInt();
//                if(counter == 1) {
//                    min = number;
//                    max = number;
//                } else {
//                    if (number > max){
//                        max = number;
//                    } else if(number < min) {
//                        min = number;
//                    }
//                }
//            } else {
//                    break;
//                }
//            scanner.nextLine();
//        }
//        System.out.println("Max number is " + max + " and Min number is " + min);
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean first = true;

        while(true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

//                if(first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }
            } else {
                break;
            }

            scanner.nextLine(); // handle input
        }

        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}

// 数字を入力する
// 入力した数字をminとmaxに代入する
// 数字を入力する
    // 入力した数字が
        // 前に入力した数字より
            // 大きければ
                // maxに代入
            // 小さければ
                // minに代入
// 前に入力した数字と比較する
    // 前に入力した数字の方が大きければ、