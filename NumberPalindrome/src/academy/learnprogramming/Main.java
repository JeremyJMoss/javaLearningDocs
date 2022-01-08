package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {
        int startNumber = 0;
        if (number < 0) {
            startNumber = number - number * 2;
        }
        else {
            startNumber = number;
        }
        number = startNumber;
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        if (startNumber == reverse) {
            return true;
        }
        return false;
    }
}
