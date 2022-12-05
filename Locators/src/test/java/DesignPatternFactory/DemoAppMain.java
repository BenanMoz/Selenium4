package DesignPatternFactory;

import org.testng.annotations.Test;

public class DemoAppMain {
    @Test
    public static void main() {

        ShapeFactory facto = new ShapeFactory();
        Shape shape = facto.createShape("rectangle");
        System.out.println(shape);
        Shape shape2 = facto.createShape("ClassInClass");
        System.out.println(shape2);
    }}

    class ShapeFactory {
        Shape createShape(String str){
            Shape ob = null;
            if(str.equals("ClassInClass")){
               ob = new Circle(5);}

             else if (str.equals("rectangle")){
                ob = new RecTangle(3,5);
            }
            return ob;
    }

}
