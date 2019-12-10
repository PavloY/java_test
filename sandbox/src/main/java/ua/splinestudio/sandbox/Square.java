package ua.splinestudio.sandbox;

public class Square {
    public double l;

    public Square(double l)
    {

     this.l = l;
    }
//убрали static
// убрали параметр
    public double area()
    {
        return this.l * this.l;
    }

}

