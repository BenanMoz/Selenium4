package DesignPatternState;

import org.testng.annotations.Test;

public class Main5 {

    @Test
    public void main5(){
         Car c = new Car("honda", new EconomicSate());
         c.setSpeed(80);
        System.out.println( c.toString());

        c.setState(new SportState());
        c.setSpeed(900);
        System.out.println(c.toString());






    }



}
