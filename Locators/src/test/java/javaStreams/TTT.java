package javaStreams;

import genericPackage.Animal;
import genericPackage.Cat;
import genericPackage.Dog;

public class TTT<T extends Animal> {
    T object;
    T object2;

   // public <T extends Animal> T printEat(){

   // }
  public static void main(String[] args){
      TTT test = new TTT() ;
     test.object = new Cat(34,"MMM");
     test.object2 = new Dog();
  }
}
