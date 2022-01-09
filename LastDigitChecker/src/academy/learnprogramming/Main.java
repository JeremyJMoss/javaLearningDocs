package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99,999));
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if (!isValid(n1) || !isValid(n2) || !isValid(n3)){
            return false;
        }
        int lastDigit1 = n1 % 10;
        int lastDigit2 = n2 % 10;
        int lastDigit3 = n3 % 10;
        if(lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3){
            return true;
        }
        return false;
    }

    public static boolean isValid(int number){
        if (number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
