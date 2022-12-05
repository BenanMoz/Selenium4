package arraysAndListsAndMapsAndSyncWork;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static <List2> void main(String[] args){
        List<String> abc= new ArrayList<>();
        //Jedis redis = new Redid("localhost");
        List<String> abc2= new ArrayList<>();
        abc.add("gogo");
        abc.add("ccc");
        abc.add("reret");
        abc.add("yh");
        abc.add(new String("Ff"));
       // System.out.println(abc.contains("ccc"));
        //System.out.println(abc.size());

        List<String> nnn = new ArrayList<>();
        List<Man> mens = new ArrayList<>();
        mens.add(new Man());
        mens.add(new Man(5,"Jeff"));
        System.out.println(mens.get(0).toString());
        System.out.println(mens.get(1).toString());

}}
