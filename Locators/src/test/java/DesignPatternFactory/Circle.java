package DesignPatternFactory;

public class Circle extends Shape{
    int radius ;

    public Circle(int i) {
        this.radius = i;
    }

    public double calcArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
