package Inhertince;

public class Cylinder extends Circle {
    int height;


    public Cylinder(){
        this(1.0,6,"green");
       // super();
    }

    public Cylinder(double v,int h,String color){
        super(v,color);
        height = h;

    }

    public void main55() {
    }

    @Override
    public double getArea(){
        return 5.0;
    }

}