package OOP2;

public class Horse {
    outsideLeather leather;
    int id;

    public Horse(int i,outsideLeather leath){
        this.leather = leath;
        this.id = i;

    }

    @Override
    public String toString() {
        return "Horse{" +
                "leather=" + leather +
                ", id=" + id +
                '}';
    }
}
