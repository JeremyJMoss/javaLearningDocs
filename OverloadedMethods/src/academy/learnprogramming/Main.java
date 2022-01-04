package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double inches = 72;
        calcFeetAndInchesToCentimeters(inches);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 || inches >=0 && inches <= 12){
            double centimeters = (feet * 12 + inches) * 2.54;
            return centimeters;
        }
        System.out.println("invalid parameters");
        return -1;
    }

    public static int calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double feet = (int) inches / 12;
            int feetInt = (int) feet;
            double remainingInches = (int) inches % 12;
            int inchesInt = (int) remainingInches;
            System.out.println(feetInt + " ft, " + inchesInt + " in = " + calcFeetAndInchesToCentimeters(feet, remainingInches) + " cm");
            return 0;
        }
        System.out.println("invalid parameters");
        return -1;
    }
}
