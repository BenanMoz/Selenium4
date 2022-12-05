package Lambda;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections.map.HashedMap;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    @Test
    public void test6() {
        Person p = new Person();

        //LmbdaInterface lmbdaInterface2 = new LmbdaInterface() {
        // @Override
        // public void print() {
        //      System.out.println("ddpoopopip");
        //  }
        //  };

        LmbdaInterface lmbdaInterface = () -> {
            System.out.println("huhu");
            //System.out.println("dds");
        };

        lmbdaInterface.print();
    }

   @Test
    public void test7() throws JsonProcessingException {
        Map<String,String> payload = new HashMap<>();
        payload.put("key1","value1");
        payload.put("key2","value2");

        String json = new ObjectMapper().writeValueAsString(payload);
        System.out.println(json);
        payload.forEach((k,v) -> System.out.println(k+v));
       }

       @Test
    public void insertToList(){
        List<String> nnn = new ArrayList<>();
        nnn.add("aaa");
        nnn.add("bbb");
        System.out.println(nnn.get(0) + nnn.get(1));
        Map<Integer,String> maps = new HashedMap();
        maps.put(3,"blabla");
        System.out.println(maps.get(3));

    }
       }
                



