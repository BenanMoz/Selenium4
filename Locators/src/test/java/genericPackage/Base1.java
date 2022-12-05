package genericPackage;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Base1 <T> {
    @Test
    public void main(){
        main5("sss");
        main5(10);
        main5(new Cat(11,"ewe")) ;
        Cat vovlo = main5(new Cat(44,"dsdVolvo"));

       // __________________
        IntegerPrinter printer = new IntegerPrinter(15);
       // printer.printIt();
       // Printer<Integer> printer1 = new Printer<>(11);
        //printer1.toPrint();
        //Printer<Double> printDounble = new Printer<>(15.0);
       //System.out.println(printDounble);
        Printer<Cat> printer3 = new Printer<>(new Cat(100,"ddde"));
        printer3.toPrint();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat(120,"dede"));

        ArrayList<Dog> allDogs = new ArrayList<>();
        allDogs.add(new Dog());

        Dog bulldog = allDogs.get(0);
        Printer<Dog> becomeBulldog = new Printer<>(bulldog);
        becomeBulldog.toPrint();

        Printer<Dog> allNewDogs = new Printer<>(new Dog());

        Cat coke = new Cat(33,"111");
        Printer<Cat> cat15 = new Printer<>(new Cat(100,"100"));
        cat15.toPrint();



        //ArrayList can be geric type to hold all types
        ArrayList<Object> myObjects = new ArrayList<>();
        myObjects.add(new Cat(1,"o0k"));
        Cat o  = (Cat)myObjects.get(0);
     }


     //Generic method
     public  <T>  T main5(T tessto){
         System.out.println(tessto);
         return tessto;
     }

     public void printListin(List<Object> listo){
         System.out.println("Dddd");
     }


     //GenericMethos with 2 pars errors

}
