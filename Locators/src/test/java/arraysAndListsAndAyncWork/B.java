package arraysAndListsAndAyncWork;

public class B {

        private MyEventListener listener;
        public void registerEventListener(MyEventListener m) throws Exception
        {
            this.listener = m;
        }

        public void method1(){
            new Thread(new Runnable() {
                public void run() {
                    System.out.println("operation in Async task");
                    if (listener != null) {
                        listener.event1();
                        try {
                           // System.out.println("ff");
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //System.out.println("operation in Async task");

                    }
                }
            }).start();
            System.out.println("ffff");
        }

        public static void main(String [] args) throws Exception
        {
            arraysAndListsAndAyncWork.B obj = new arraysAndListsAndAyncWork.B();
            MyEventListener listener = new A();
            obj.registerEventListener(listener);
            obj.method1();
        }
    }

