package Inhertince;

import org.testng.annotations.Test;

public class mania {


    @Test
    public static void main5(){
        Cylinder cv = new Cylinder();
        Cylinder cv2 = new Cylinder(9.0,6,"rere");
        System.out.println(cv2.getArea());
        System.out.println(cv.color);

    }
}
