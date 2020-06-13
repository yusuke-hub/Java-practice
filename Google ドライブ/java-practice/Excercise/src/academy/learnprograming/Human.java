package academy.learnprograming;
import java.util.Scanner;

public class Human {
    private int age;
    private String sex;
    private String name;
    private double height;
    private double weight;
    private double BMI;
    private int basalMetabolism;


    Human() {

    }
    Human(int age, String sex, String name, double height, double weight) {
                this.age = age;
                this.sex = sex;
                this.name = name;
                this.height = height;
                this.weight = weight;

                // 性別によって、基礎代謝の計算方法が変わってくる
                if(sex.equals("男")) {
                    this.basalMetabolism = (int) Math.floor(66 + 13.7 * weight + 4.799 * height - 5.677 * age);
                } else if(sex.equals("女")) {
                    this.basalMetabolism = (int) Math.floor(447.593 + 9.247 * weight + 3.098 * height - 4.330 * age);
                } else {
                    System.out.println("男、あるいは女のどちらかで入力してください");
                }
    }

    // 全てのプロパティに対するsetter
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 全てのプロパティに対するgetter
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public double getBMI() {
        return BMI;
    }
    public int getBasalMetabolism() {
        return basalMetabolism;
    }

    public void confirmBodyComposition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("年齢を入力してください");
        boolean hasNextInt = scanner.hasNextInt();
        while(hasNextInt) {
            this.age = scanner. nextInt();
            scanner.nextLine();

            System.out.println("性別を、男か女のいずれか、で入力してください");
            this.sex = scanner.nextLine();


            System.out.println("名前を入力してください");
            this.name = scanner.nextLine();


            System.out.println("身長を入力してください");
            this.height = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("体重を入力してください");
            this.weight = scanner.nextDouble();
            scanner.nextLine();

            this.BMI = (int) Math.floor(this.weight / (this.height * this.height));
            // 性別によって、基礎代謝の計算方法が変わってくる
            if(sex.equals("男")) {
                this.basalMetabolism = (int) Math.floor(66 + 13.7 * weight + 4.799 * height - 5.677 * age);
            } else if(sex.equals("女")) {
                this.basalMetabolism = (int) Math.floor(447.593 + 9.247 * weight + 3.098 * height - 4.330 * age);
            } else {
                System.out.println("男、あるいは女のどちらかで入力してください");
            }




            System.out.println(this.name + "さん");
            System.out.println("年齢: " + this.age);
            System.out.println("性別: " + this.sex);
            System.out.println("身長: " + this.height);
            System.out.println("体重: " + this.weight);
            System.out.println("BMI: " + this.BMI);
            System.out.println("基礎代謝: " + this.basalMetabolism);
            break;
        }
        scanner.close();

    }

}
