package ua.splinestudio.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");
        hello("Oleh");
        hello("Lesha");
        double a = 5;
        double b = 8;
        System.out.println("Square " + a + " = " + area(a));
        System.out.println("Square " + a + " = " + area(a,b));
    }

    public static void hello( String hello){
        System.out.println("Hello, " + hello + "!");
    }

    public static double area(double l){
        return l*l;

    }
    public static double area(double a, double b){
        return a * b;
    }
}

