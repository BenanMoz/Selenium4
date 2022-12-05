package Plymorphism;

import org.testng.annotations.Test;

public class Main {


    @Test
    public static void main1() {
        Cat c = new Cat();
        Dog d = new Dog();
        Cat c2 = new Cat();
        System.out.println(d.voice);
        System.out.println(c.food);
        System.out.println(c2.height);
        System.out.println(c2.height);
    }


    @Test
    public static void main2() {
        Mammal[] pets = new Mammal[4];
        pets[0] = new Cat();
        pets[1] = new Dog();
        pets[2] = new Cat();
        pets[3] = new Dog();

        for (Mammal m : pets) {
            m.printName();
           if (m instanceof Cat) {
               ((Cat)m).showFood();
           }

        }
    }
}

