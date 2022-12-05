package ClassInClass;

import org.testng.annotations.Test;

public class manioo {
    Parent parent = new Parent();
    Child Child = new Child();

    @Test
 public void orr(){
     Child.s = "ttt";
     Child.y = 4;
     parent.s = "sdsds";
     parent.s = "fff";

     Child.print(6);
     Child.print();

    parent.print();
 }

}
