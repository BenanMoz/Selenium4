package OOP2;

public class Dog extends Animal{

    String oreg;
    Food food;

    public Dog(String ore,String name, int age,Food food)
    {
     oreg = ore;
     this.name = name;
     this.age = age;
     this.food = new Food(food.name, food.type);
    }

    @Override
    public void call() {
        System.out.println("call call aw awwww");
    }

    @Override
    public void printAge() {
        System.out.println("im cat, and my age is" + age);

    }

    @Override
    public void printName() {
        System.out.println(name + " im dog ");

    }
}
