package genericPackage;

import java.io.Serializable;

public class Printer<T extends Animal > {
    T thing;
    public Printer(T object){
      this.thing = object;
    }
    public void toPrint(){
        System.out.println(thing);
        //thing.eat();
    }
}
