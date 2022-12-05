package OOP2;

public class Cat extends Animal implements InterfaceOfAnimal{

    int id;
    Food food;



    public Cat(int id,String name,int age,Food re){
        this.id = id;
        this.age = age;
        this.name = name;
        this.food = new Food(re.name,re.type);
    }

    @Override
    public void call() {
        System.out.println("call call miawww");

    }


    @Override
    public void printAge() {
        System.out.println("im cat, and my age is" + age);

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void printName() {
        System.out.println(name + " im cat");

    }

    public void cutHair(){
        System.out.println("Dddddd cten ctem dsq2");
    }

    public void jumpForCatOnly() {
        System.out.println("cateee");
    }
}
