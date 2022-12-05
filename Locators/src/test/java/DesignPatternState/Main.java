package DesignPatternState;

import org.testng.annotations.Test;

public class Main {

    @Test
    public static void main2(){
       Car myCar = new Car("toyota",new SportState());
       myCar.setSpeed(150);
      System.out.println(myCar);
        myCar.setSpeed(120);
        System.out.println(myCar);
        myCar.setSpeed(90);
       System.out.println(myCar);

        myCar.setState(new EconomicSate());
        System.out.println(myCar);
       myCar.setSpeed(150);
       System.out.println(myCar);
    }
}
