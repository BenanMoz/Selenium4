package ClassInClass;

import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOfPoints {
    List<Point> listr = new ArrayList<>();
    List<Circle> circles = new ArrayList<>();

    @Test
    public void main5() {
        listr.add(new Point(6, 7));
        Point xo = new Point(8, 8);
        Point pl = new Point(xo);
        listr.add(xo);
        circles.add(new Circle(1, 1, pl));


        // circles.add(new Circle(7,8,xo));
        System.out.println(listr.get(0).toString());
        System.out.println(listr.get(1).toString());
        System.out.println(pl.toString());
        xo.setX(90);
        xo.setY(900);
        System.out.println(listr.get(0).toString());
        System.out.println(listr.get(1).toString());
        System.out.println(pl.toString());
        // List<Circle> circles = new ArrayList<>();
        System.out.println("ddd");
        System.out.println(circles.get(0).toString());
        System.out.println("gtg");
        System.out.println(Circle.serialNumber);
        Circle circle00 = new Circle(5, 5, xo);
        System.out.println(circle00.getCenter().getX());


    }


    @Test
    public void re() {
        List<String> ccc = new ArrayList<>();
        ccc.add("dddd");
        ccc.add("4rf");
        //System.out.println(ccc.get(0));
        List<String> ccc2 = ccc;
        List<String> ggg = new ArrayList<>();
        ggg.addAll(ccc);
        ccc.remove(0);
        System.out.println(ccc.get(0));

    }

    @Test
    public void ftr(){
        List<Integer> source = Arrays.asList(1,2,3);
        List<Integer> dest = Arrays.asList(4,5,6);
        Collections.copy(dest, source);
        System.out.println(source.get(0));
        //source.remove(0);
        for (Integer intr : dest
             ) {
            System.out.println(intr);
        }
    }


}

