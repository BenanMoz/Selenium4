package ComplexMapsWithLists;

import org.testng.annotations.Test;

import java.util.*;

public class Gardens {

   private static final Map<String, List<Cat>> cats1 = new HashMap<>();
   public static final Map<String,String> strings = new HashMap<>();
   public static final Map<String,List<String>> sets = new HashMap<>();
   public static final Map<String,Cat> cat1 = new HashMap<>();
   private static Map<String,List<Animal>> animals = new HashMap<>();


    List<Cat> los = new ArrayList<>();

   static {
       strings.put("1","keto");
       //strings.put("1","keto");
       strings.put("2","kato");
       strings.put("jk","ssd");
       strings.put("rer","erer");
       List<Cat> ccccp = new ArrayList<>();
       cats1.put("j99", ccccp);
       cats1.put("j1", new ArrayList<>());
       cats1.put("j2",new ArrayList<>());
       cats1.put("j3", Arrays.asList((new Cat(5,"555")),new Cat(4,"444")));
       cat1.put("j9",new Cat(6,"gtt"));
       sets.put("gf", Arrays.asList("fff","fff78"));
       animals.put("j89",Arrays.asList(new Cat(55,"ffdffd")));
       Cat ko = new Cat(4,"dsd");
       List<Animal> ffrt = new ArrayList<>();
       ffrt.add(ko);
       animals.put("ggggg",ffrt);
       animals.put("klklkl",Arrays.asList(ko));
   }
   @Test
   public static void main1() {
       //for (int i = 0; i < 2; i = i + 1) {
       System.out.println(strings.get("1"));
       System.out.println(strings.entrySet());

           System.out.println(cats1.entrySet());
           System.out.println(cats1.keySet());
            System.out.println(cats1.get("j3").toString());
            System.out.println(sets.get(0));
            System.out.println(sets.get(1));
             System.out.println(strings.entrySet());
             System.out.println(strings.get("rer"));

      // }

   }



}
