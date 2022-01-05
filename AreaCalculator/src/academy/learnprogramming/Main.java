package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double rectSide1 = 5;
        double rectSide2 = 17;
        double circleRadius = 15;
        System.out.println(area(rectSide1, rectSide2));
        System.out.println(area(circleRadius));
    }

    public static double area(double radius){
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }
}
