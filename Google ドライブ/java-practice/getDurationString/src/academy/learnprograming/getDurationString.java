package academy.learnprograming;

public class getDurationString {
    // 1hour = 60minutes = 3600seconds
    public static String getDurationString(int minutes, int seconds){
        if((minutes >= 0) || (seconds >= 0 && seconds <= 59)){
            int totalSeconds = minutes * 60 + seconds;
            int hours = totalSeconds / 3600;
            minutes = totalSeconds % 3600 / 60;
            seconds = totalSeconds % 3600 % 60;
            return hours + "h " + minutes + "m " + seconds + "s";
        }else {
            return "Invalid value";
        }
    }

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds / 60;
            seconds %= 60;
            return getDurationString(minutes, seconds);
        }else {
            return "Invalid value";
        }
    }
}
