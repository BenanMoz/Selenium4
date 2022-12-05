package arraysAndListsAndAyncWork;

public class A implements MyEventListener{
    @Override
    public void event1() {
        System.out.println("call baack after async task");
    }
}
