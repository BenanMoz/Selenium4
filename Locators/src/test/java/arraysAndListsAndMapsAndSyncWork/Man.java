package arraysAndListsAndMapsAndSyncWork;

public class Man {
    int id;
    String name;


    public Man() {
    }

    public Man(int x, String Namew) {
        this.id = x;
        this.name = Namew;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}