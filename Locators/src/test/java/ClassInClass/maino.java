package ClassInClass;

import org.testng.annotations.Test;

public class maino
{

    NewCircle newcircle = new NewCircle(5,6,7);


    @Test
    public void main55(){
        NewCircle newcircleu = new NewCircle(9,9,9);

        System.out.println(newcircleu.getNewPoint().getX());
       //N NewPoint newPoint = new NewCircle.NewPoint(6,7);

        //NewCircle.NewPoint bnb = new NewCircle.NewPoint(2,4);
    }
}
