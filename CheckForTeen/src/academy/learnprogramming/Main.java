package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(13, 24, 24));
    }

    public static boolean hasTeen(int age1, int age2, int age3){
        if (age1 >= 13 && age1 <= 19){
            return true;
        }
        if (age2 >= 13 && age2 <= 19){
            return true;
        }
        if (age3 >= 13 && age3 <= 19){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age){
        if (age >= 13 && age <= 19){
            return true;
        }
        return false;
    }
}
