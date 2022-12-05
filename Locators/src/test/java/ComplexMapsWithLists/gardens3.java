package ComplexMapsWithLists;

import com.google.gson.Gson;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class gardens3 {

    @Test
    public static void main4(){
        Gson gson = new Gson();
        Cat cc = new Cat(4,"gggtt");
        System.out.println(cc);
         String d =  gson.toJson(cc);
         System.out.println(d);
       // newCar anyName = gson.fromJson(v,newCar.class);
        //System.out.println(ccc.id);
        //System.out.println(ccc.id2);

        List<Cat> ccs = new ArrayList<>();
        ccs.add(new Cat(4,"44"));
        ccs.add(new Cat(5,"fdsf"));
       ccs.forEach(cat -> System.out.println(cat.name));


       List<Cat> cates = new ArrayList<>();

        //System.out.println(ff::f);

        }
    }
