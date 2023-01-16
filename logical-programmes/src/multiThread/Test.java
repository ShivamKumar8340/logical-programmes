package multiThread;

public class Test{


    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        Thread t1 = new Thread(t);
        t1.start();
        t1.interrupt();
            System.out.println("main Thread");

    }
}
