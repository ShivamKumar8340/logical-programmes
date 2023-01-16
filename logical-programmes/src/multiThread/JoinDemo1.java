package multiThread;

public class JoinDemo1 extends Thread{
    public void run() {
        for (int i =1;i<=5; i++) {
            try {
                Thread.sleep(500);
                System.out.println("The current Thread name is: "+Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println("The exception has been caught "+e);
            }
            System.out.println(i);
        }
    }

}
