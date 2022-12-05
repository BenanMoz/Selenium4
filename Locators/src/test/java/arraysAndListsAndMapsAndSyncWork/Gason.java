package arraysAndListsAndMapsAndSyncWork;

import com.google.gson.Gson;
import org.testng.annotations.Test;

public class Gason {

   //  String h ;
   // List<String> lista = new ArrayList<>();



    @Test
    public void bvn(){
        DDD dd = new DDD();
        String v = dd.b;
        Gson gson = new Gson();
        Gason anyName = gson.fromJson(v,Gason.class);
      //  System.out.println(anyName.h);

        System.out.println(dd.abc);
        System.out.println(dd.lo);


    }
}