package OOP2;

public class WolfDog extends Dog{
    public WolfDog(String ore, String name, int age, Food food) {
        super(ore, name, age, food);
    }
    @Override
    public void call() {
        System.out.println("call call aw awwww im wolf gogggg");
    }

}
