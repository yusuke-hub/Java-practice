package academy.learnprograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        ★ my solution
//        Scanner scanner = new Scanner(System.in);
//        int count = 0;
//        while(count < 10){
//            count++;
//            System.out.println("Enter number #" + count + ":");
//            boolean hasNextInt = scanner.hasNextInt();
//            if(hasNextInt){
//                int number = scanner.nextInt();
//                scanner.nextLine();
//            } else {
//                    System.out.println("Invalid Number");
//                }
//            }
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        // あえて無限ループにして、{}内で条件式を設定して、breakする
        while(true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line(enter key)
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }
}
