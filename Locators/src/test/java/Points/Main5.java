package Points;

import org.testng.annotations.Test;

public class Main5 {

    Point point = new Point(3,4);

    @Test
    public void main7(){
        System.out.println(point.toString());
        Point p3 = new Point(point);
        System.out.println(p3.toString());
        point.setX(77);
        System.out.println(point.toString());
        System.out.println(p3.toString());
    }
}
