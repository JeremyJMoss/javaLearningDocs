package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        double firstNumberTimes1000 = firstNumber * 1000;
        double secondNumberTimes1000 = secondNumber * 1000;
        int firstToThree = (int) firstNumberTimes1000;
        int secondToThree = (int) secondNumberTimes1000;
        if (firstToThree == secondToThree){
            return true;
        }
        return false;
    }
}
