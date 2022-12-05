package Inhertince;

public class Circle {
   protected double radius;
   protected   String color;

    public Circle(int v) {
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea(){
        return (Math.PI * radius * radius);
    }
}
