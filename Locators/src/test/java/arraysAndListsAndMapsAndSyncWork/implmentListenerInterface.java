package arraysAndListsAndMapsAndSyncWork;

public class implmentListenerInterface implements MyEventListener
{

    @Override
    public void event1() {
        System.out.println("call back after sync");
    }
}
