package arraysAndListsAndMapsAndSyncWork;

public class ClassEventListener {

    MyEventListener myEventListener;

    public void registClassEventListener(MyEventListener e){
        this.myEventListener = e;
    }

    public void method() {
        System.out.println("call back before sync");
        if(this.myEventListener  != null){
            myEventListener.event1();
        }
    }

    public static void main(String[] args) {
        ClassEventListener c = new ClassEventListener();
        MyEventListener m = new implmentListenerInterface();
        c.registClassEventListener(m);
        c.method();
    }



}
