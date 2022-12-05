package OOP2;

public abstract class Animal implements InterfaceOfAnimal{

    protected String name;
    protected int age;

    public String getNameWithYes(){
        return name + " : yes";
    }

    public abstract void call();

    public abstract void printAge();

    @Override
    public void sayHello(){
        System.out.println("hello");
    }

    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void cutHair(){
        System.out.println("cut hairs");
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
