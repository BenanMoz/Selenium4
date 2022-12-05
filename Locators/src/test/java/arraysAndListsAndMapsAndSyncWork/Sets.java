package arraysAndListsAndMapsAndSyncWork;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<Man> setMen = new HashSet<>();
        setMen.add(new Man(5,"doda"));
        setMen.add(new Man(5,"doda"));
        setMen.add(new Man(6,"dol"));
        setMen.remove(new Man(
                5,"doda"));

        setMen.forEach(System.out::println);
    }


}
