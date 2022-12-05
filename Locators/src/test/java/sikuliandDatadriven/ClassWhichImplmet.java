package sikuliandDatadriven;

import org.testng.annotations.Test;

public class ClassWhichImplmet implements Printo {

    // Printable printable = new Printable() {
    @Test
    public void start(){
        ClassWhichImplmet classWhichImplmet = new ClassWhichImplmet();
        print1();
        print2();
        print3(3,"dds");
        print4(classWhichImplmet);
    }

    @Override
    public void print1() {
        System.out.println("hello");
    }


    @Override
    public void print2() {
        System.out.println("hello2");
    }

    @Override
    public void print3(int x, String g) {
        x = ii;
        g = go;
    }

    public void print4(Printo printo){
        printo.print1();
    }

}




