package academy.learnprograming;

public class Main {
    
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3590L));
    }
    // 1hour = 60minutes = 3600seconds
    // my solution
//    public static String getDurationString(int minutes, int seconds){
//        if((minutes >= 0) || (seconds >= 0 && seconds <= 59)){
//            int totalSeconds = minutes * 60 + seconds;
//            int hours = totalSeconds / 3600;
//            minutes = totalSeconds % 3600 / 60;
//            seconds = totalSeconds % 3600 % 60;
//            return hours + "h " + minutes + "m " + seconds + "s";
//        }else {
//            return "Invalid value";
//        }
//    }
//
//    public static String getDurationString(int seconds){
//        if(seconds >= 0){
//            int minutes = seconds / 60;
//            seconds %= 60;
//            return getDurationString(minutes, seconds);
//        }else {
//            return "Invalid value";
//        }
//    }
    private static String getDurationString(long minutes, long seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }
        String minutesString = minutes + "h";
        if(minutes < 10){
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "h";
        if(seconds < 10){
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString + " ";
    }
    private static String getDurationString(long seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
