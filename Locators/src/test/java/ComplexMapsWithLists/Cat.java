package ComplexMapsWithLists;

public class Cat extends Animal{
    protected int ido;

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    protected String name5;

    @Override
    public void name() {
        System.out.println("cat cat");
    }

    public Cat(int id, String name){
        this.name = name;
        this.id = id;
    }
}
