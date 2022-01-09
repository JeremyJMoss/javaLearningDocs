package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;
        while (number > 0){
            int numberToCheck = number % 10;
            if (numberToCheck % 2 == 0){
                sum += numberToCheck;
            }
            number /= 10;
        }
        return sum;
    }
}
