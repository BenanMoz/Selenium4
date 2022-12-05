package OOP2;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mains {

    Food foodDog = new Food("dogle","vege");
    Food foodCat = new Food("milk", "whiteEat");

    Animal[] animals = new Animal[3];

    Map<String,Cat> catsMap = new HashMap<>();

    @Test
    public void initiate(){
        animals[0] = new Cat(23,"koke",1,foodCat);
        animals[1] = new Cat(22,"kete",7,foodCat );
        animals[2] = new Dog("ret","rex",13,foodDog);
    }

    @Test
    public void intiateList(){
    List<Animal> animale = new ArrayList<>();
    animale.add(new Cat(23,"koke",1,foodCat));
    animale.add(new Cat(22,"kete",7,foodCat ));
    animale.add(new Dog("ret","rex",13,foodDog));
    animale.add(new WolfDog("reto","rewwxe",13,foodDog));

    animale.get(0).call();
    animale.get(1).call();
    ((Cat)animale.get(1)).jumpForCatOnly();
        System.out.println("\n");
    ((Cat)animale.get(0)).jumpForCatOnly();

        for (Animal any : animale
             ) {
            any.call();
            any.cutHair();
        }
    }}
