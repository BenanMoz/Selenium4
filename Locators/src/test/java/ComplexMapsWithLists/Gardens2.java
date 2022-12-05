package ComplexMapsWithLists;

import arraysAndListsAndAyncWork.A;
import org.testng.annotations.Test;

import java.util.*;

public class Gardens2 {

    Map<String, ArrayList<Animal>> nmn = new HashMap<>();
    Map<String,List<Animal>> v2v = new HashMap<>();

    @Test
    public void vevMap(){
//        nmn.put("katkota",(ArrayList)Arrays.asList(new Cat(12,"reww"),(new Cat(13,"trtr"))));
        v2v.put("olo", Arrays.asList(new Cat(332,"kol")));
        //nmn.put("frde",Arrays.asList(new Dog(15,"kio","reso")));
        List<String> pass = new ArrayList<>();
        Dog.Home home = new Dog.Home();
        pass = Arrays.asList("qa","dev","ops","automate"); 
  //      nmn.put("lione",(ArrayList)Arrays.asList(new Dog(16,"king","CC",pass,home)));
   //     nmn.put("cc5", (ArrayList)Arrays.asList(new Dog(32,"pitbull","sa",pass,home)));
     //   nmn.put("katkota",(ArrayList)Arrays.asList(new Cat(56,"rewwka")));
        ArrayList<Animal> list =nmn.get("katkota");
       // List<Animal> xx = nmn.get("katkota");
     //   list.add(new Cat(24252,"pop"));
        //list.add(new Cat(33333,"xoxo"));
        //list.add(new Cat(00,"mnbv"));
        //nmn.put("katkota",list);
       // for (Map.Entry<String,ArrayList<Animal>>entry : nmn.entrySet())
            //System.out.println("Key = " + entry.getKey() +
                   // ", Value = " + entry.getValue());
// }

        for (Map.Entry<String, List<Animal>> entry : v2v.entrySet()){
            System.out.println("Key = " + entry.getKey() +
             ", Value = " + entry.getValue());

    }}}


