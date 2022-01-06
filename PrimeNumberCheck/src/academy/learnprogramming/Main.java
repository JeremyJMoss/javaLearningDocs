package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
        for (int i=1; i <= 100; i ++){
            if (isPrime(i)){
                count += 1;
            }
        }
        System.out.println(count + " prime numbers found");
    }

    public static boolean isPrime(int n){
        if (n == 1) {
            return false;
        }

        for (int i=2; i <= n/2; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
