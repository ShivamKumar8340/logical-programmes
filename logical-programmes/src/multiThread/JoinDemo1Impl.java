package multiThread;

public class JoinDemo1Impl {
    public static void main(String[] args) {
        JoinDemo1 demo1 = new JoinDemo1();
        JoinDemo1 demo2 =  new JoinDemo1();
        JoinDemo1 demo3 = new JoinDemo1();

        demo1.start();

        try {
            System.out.println("The current Thread name is "+Thread.currentThread().getName());

            demo1.join(1500);
        }catch (Exception e) {
            System.out.println("The Exception has been caught "+e);
        }

        demo2.start();
        try {
            System.out.println("The current Thread name is: "+Thread.currentThread().getName());
            demo2.join();
        } catch (Exception e) {
            System.out.println("The Exception has been caught "+e);
        }
        demo3.start();
    }
}
