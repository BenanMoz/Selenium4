package DesignPatternFactory;

public class RecTangle extends Shape {
    int x;
    int y;

    public RecTangle(int ex,int yi) {
        x=ex;
        y=yi;
    }

    public double calcArea() {
        return (x*y)/2;
    }

    @Override
    public String toString() {
        return "RecTangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
