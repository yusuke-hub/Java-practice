package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(4,2018));

    }
    public static boolean isLeapYear(int year){
        if(year <= 0 || year >= 10000){
            System.out.println("Invalid Month");
            return false;
        }else {
            if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
                System.out.println("");
                System.out.println("This year is a leap year.");
                return true;
            }else {
                System.out.println("");
                System.out.println("This year is not a leap year");
                return false;
            }
        }
    }
    public static int getDaysInMonth(int month, int year){

        int[] smallMonth = new int[]{4, 6, 9, 11};
        for(int i = 0; i < smallMonth.length; i++){
            if(month == smallMonth[i]){
                System.out.println("");
                System.out.println("Since this month is a small calendar, the number of days per month is 30.");
                return 30;
            }
        }

        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }else {
            if(!isLeapYear(year)){
                if(month == 2){
                    return 28;
                }else {
                    return 31;
                }
            }else {
                if(month == 2){
                    return 29;
                }else {
                    return 31;
                }
            }

        }
    }
}
