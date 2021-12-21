package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        //strings are immutable this code creates new string in memory and discards old value
        lastString = lastString + myInt;
        System.out.println("Last String is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last String is equal to " + lastString);
    }
}
