package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaByte = 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int kiloBytesLeft = kiloBytes % megaByte;
            double megabytes = kiloBytes/megaByte;
            int megabytesFloored = (int) Math.floor(megabytes);
            System.out.println(kiloBytes + " KB = " + megabytesFloored + " MB and " + kiloBytesLeft + " KB.");
        }
    }
}
