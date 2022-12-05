package Points;

import com.google.common.collect.Multimap;
import org.testng.annotations.Test;

import java.util.*;

public class Main4 {

    @Test
    public void main3(){
        ListOfPoints liste = new ListOfPoints(new ArrayList<>());
        //ListOfPoints liste2 = new ListOfPoints(liste.pointlist);

        liste.pointlist.add(new Point(3,5));
        liste.pointlist.add(new Point(6,7));
        liste.pointlist = Arrays.asList(new Point(4,4),new Point(9,9),new Point(7,7),new Point(1,1));

        List<Point> t1 = Arrays.asList(new Point(4,4),new Point(9,9),new Point(7,7),new Point(1,1));

        Collections.sort(t1);
        for(Point point : t1){
            System.out.println(point);
        }


        System.out.println("fjfjfjff");
        Point[] listOfPointsArr = new Point[liste.pointlist.size()];
       for (int i=0;i<liste.pointlist.size()-2;i=i+1){
          for(int j=0; j< liste.pointlist.size()-2; j=i+1){
           if(liste.pointlist.get(i).method1_is_above(liste.pointlist.get(j+1))){
                 listOfPointsArr[j] = liste.pointlist.get(j);
              }

        }}
        System.out.println(listOfPointsArr[0] + " " + listOfPointsArr[1] + " " + listOfPointsArr[2]);

        MapOfListsOfPoints mapOfList = new MapOfListsOfPoints(new HashMap<>());
        mapOfList.mapo.put("kkk",new ListOfPoints(Arrays.asList(new Point(4,4),new Point(9,9),new Point(7,7),new Point(1,1))));

}}
