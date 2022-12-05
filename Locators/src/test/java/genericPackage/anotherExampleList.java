package genericPackage;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class anotherExampleList {

    @Test
    public static void voidMain(){
        List<Integer> integers = new ArrayList<>();
        integers.add(10000);
        printList(integers);
    }

    private static void printList(List<?> objs){
        System.out.println();
    }
}
