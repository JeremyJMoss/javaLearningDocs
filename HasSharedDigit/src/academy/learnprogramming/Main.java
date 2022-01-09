package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int a, int b){
        if (a < 10 || a > 99 || b < 10 || b > 99){
            return false;
        }
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        a /= 10;
        b /= 10;
        int firstDigitA = a % 10;
        int firstDigitB = b % 10;
        System.out.println(lastDigitA);
        System.out.println(lastDigitB);
        System.out.println(firstDigitA);
        System.out.println(firstDigitB);
        if (lastDigitA == lastDigitB || lastDigitA == firstDigitB || lastDigitB == firstDigitA || firstDigitA == firstDigitB ){
            return true;
        }
        return false;
    }
}
