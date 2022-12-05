package ComplexMapsWithLists;

import arraysAndListsAndMapsAndSyncWork.Man;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garden {
    private List<Animal> animals;

    public static class Profile {
        int id;
        private List<Bank> banks = new ArrayList<>();
        private Map<String,Man> mens = new HashMap<>();

        public Map<String, Man> getMens() {
            return mens;
        }

        public int getId() {
            return id;
        }

        public List<Bank> getBanks() {
            return banks;
        }

        public static class Man{
            String name1;
        }

        public static class Bank{
          int x;
          public Bank(int f){
              this.x = f;
          }

      }

    }
    public static void main3(){
      Profile p = new Profile();
      p.banks = new ArrayList<>();
      Profile.Bank bt = new Profile.Bank(6);
      p.banks.add(new Profile.Bank(5));
      //p.mens.put("ttt",new Man());

    }
}
