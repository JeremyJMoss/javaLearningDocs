package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }
        else {
            boolean leapYear;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leapYear = true;
                    } else {
                        leapYear = false;
                    }
                } else {
                    leapYear = true;
                }
            } else {
                leapYear = false;
            }
            return leapYear;
        }
    }
}
