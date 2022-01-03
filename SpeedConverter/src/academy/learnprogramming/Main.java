package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printConversion(10.25);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double miles = kilometersPerHour / 1.609;
            return Math.round(miles);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        long miles = toMilesPerHour(kilometersPerHour);
        if (miles == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }
}