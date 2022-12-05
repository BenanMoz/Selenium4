package Plymorphism;

public class Dog extends Mammal{
    int age = 10;
    String voice = "haw haw";

    public void printName(){
        System.out.println("im dog my name is " + " " +  this.name );
    }
    public void Voice(){
        System.out.println("my voice is haw haw" + voice);
    }
}
