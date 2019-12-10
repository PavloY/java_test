package ua.splinestudio.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");
        hello("Oleh");
        hello("Lesha");


        Square s = new Square(5);
    //вместо area(s) меняем s.area()
        System.out.println("Square " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);

        System.out.println("Square " + r.a + " = " + r.area());
    }

    public static void hello( String hello){
        System.out.println("Hello, " + hello + "!");
    }
}

