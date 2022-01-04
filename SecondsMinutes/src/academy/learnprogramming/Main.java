package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        int seconds = -1;
        System.out.println(getDurationString(seconds));
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes >= 0 || seconds >= 0 && seconds <=59){
            String x = "";
            String y = "";
            String z = "";
            int hours = (int) minutes / 60;
            int minutesRemaining = minutes % 60;
            if (hours < 10) {
                x = "0";
            }
            if (minutesRemaining < 10){
                y = "0";
            }
            if (seconds < 10){
                z = "0";
            }
            return x + hours + "h " + y + minutesRemaining + "m " + z + seconds + "s";
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int seconds){
        if (seconds >= 0){
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
