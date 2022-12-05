package ComplexMapsWithLists;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
    private String nickName;
    List<String> haw = new ArrayList<>();
    Home home ;


    public static class Home{
        long Address;
    }

    public Dog(){
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Dog(int t, String k, String ni,List<String> reals,Home home) {
        this.id = t;
        this.name = k;
        this.nickName = ni;
        this.haw = reals;
        this.home = home;

    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public void name() {
        System.out.println(name);
    }

    public void setName(String g){
        this.nickName = g;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickName='" + nickName + '\'' +
                ", haw=" + haw +
                '}';
    }
}
