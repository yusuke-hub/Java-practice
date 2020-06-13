package academy.learnprograming;

public class BodyComposition {
    private String sex;
    private int age;
    private double weight;
    private int height;
    private double BMI;
    private double basalMetabolism;
    private int muscleVolumePercentage;
    private double bodyFatPercentage;
    private int exerciseScore;



    BodyComposition() {

    }
    BodyComposition(String sex, double weight, int height) {
        this.weight = weight;
        this.height = height;
        this.BMI = weight / (height * height);
        if(sex.equals("male")) {
            this.basalMetabolism = 13.397d * weight + 4.799 * height - 5.677 * age * 88.362;
        } else if(sex.equals("female")) {
            this.basalMetabolism = 9.247 * weight + 3.098 * height - 4.33 * age + 447.593;
        }
    }

}
