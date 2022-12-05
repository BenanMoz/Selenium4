package arraysAndListsAndMapsAndSyncWork;

import java.util.*;

public class Mapp {

    public static void main(String[] args) {

        Map<Integer, Man> mape = new HashMap<>();
        mape.put(1, new Man(3, "alex"));
        mape.put(2, new Man(2, "ford"));
        mape.put(2, new Man(2, "forde"));
        mape.put(3, new Man(4, "fff"));
        //System.out.println(mape);
        //System.out.println(mape.size());
        //System.out.println(mape.entrySet());


        mape.entrySet().forEach(System.out::println);
        mape.remove(3);


        mape.forEach((key, man) -> {
            System.out.println(key + "  " + "__" + man);
        });
        mape.entrySet().forEach(x -> System.out.println(x.getKey() + "  " + x.getValue()));

        // System.out.println(mape.values());

        //_______________________________________________________________________________________-
        //put one map in another map
        Map<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "test");
        hm1.put(2, "test2");

        Map<Integer, String> hm2 = new HashMap<>();
        hm2.put(3, "Tes1");
        hm2.put(4, "Tes2");

        hm2.forEach((k, v) -> hm1.putIfAbsent(k, v));
        System.out.println(hm1);

        System.out.println(hm1.get(1).hashCode());
        hm2.forEach((k, v) -> hm1.putIfAbsent(k, v));

        //__________________________________________________________________________________________

        // convert map to array of objects


        List<String> g5 = new ArrayList<>();
        g5.add("abc");
        g5.add("bcd");
        int i = 0;
        String[] stre = new String[2];
        for (String sd : g5) {
            stre[i] = sd;
            i = i + 1;
        }
        System.out.println(Arrays.toString(stre));
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("RED", "#FF0000");
        hashMap.put("BLUE", "#0000FF");

        Object[] objectArray = hashMap.entrySet().toArray();

        System.out.println(Arrays.toString(objectArray));
    }

    public Map<String, String> returnSpecific(Map<String, String> ssp) {
            Map<String,String> koke  = new HashMap();
            koke.put("vvv","vvc");
            return koke;
    }

    }
