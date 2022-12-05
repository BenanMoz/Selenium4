package sikuliandDatadriven;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sun.tools.javac.util.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.*;


public class base1 {

    static WebDriver driver;
    Actions action;

    public class Car {
        private int id = 0;
        int id2 = 3;
        List<String> nmnm = new ArrayList<>();
        Map<String,List> mkklj = new HashMap<>();

        public void set(int id){
            this.id = id;
        }
        }



    @Test
    public void main1() {

        List<Car> cars = new ArrayList<>();
        List<String> nmnm = new ArrayList<>();

        Car b = new Car();
        b.id2 = 5;
        b.id = 77;
        cars.add(b);
       // System.out.println(cars.get(0).id);
        Map<String,String> c = new HashMap<>();
        c.put("ben","benz");
        c.put("ko","cccl");
        //System.out.println(c.get("ben"));
        Set set = c.entrySet();
       // System.out.println(set);
        Iterator i = set.iterator();
        while (i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me);


        }}
        @Test
        public void main2(){
        Car bn = new Car();
        bn.id=12345;
        bn.id2 = 2222;
            List<String> mystr = new ArrayList<>();
            Map<String,Car> mapCar = new HashMap<>();
            Map<String,String> mmkmk = new HashMap<>();
            Car jkj = new Car();
            mmkmk.put("cccc","cdc");
            System.out.println(mmkmk.get("cccc"));
            Map<String,Car> mnm = new HashMap<>();
            mnm.put("ddd",jkj);
            System.out.println(mnm.get("ddd").id);
            System.out.println(mnm.get("ddd").id2);

            }
            @Test
             public void main3() {
                Gson gson = new Gson();
                Car cc = new Car();
                cc.id = 15;
                cc.id2 = 330;
               String v = gson.toJson(cc);
               //System.out.println(v);
                Car ccc = gson.fromJson(gson.toJson(cc),Car.class);
                System.out.println(ccc.id);
                System.out.println(ccc.id2);
                String b = "vvvd";

            }






            }
           // mapCar.put("ben",bn);
          //  System.out.println(mapCar.get("ben"));
          //  mystr.add("111");
         //   mystr.add("222");







