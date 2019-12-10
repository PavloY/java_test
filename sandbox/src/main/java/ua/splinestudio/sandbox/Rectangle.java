package ua.splinestudio.sandbox;

public class Rectangle {
    //1) описываем отрибуты класса
    public double a;
    public double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double area()
    {
        return this.a * this.b;
    }
}
