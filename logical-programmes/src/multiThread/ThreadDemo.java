package multiThread;

public class ThreadDemo extends Thread {

    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("child Thread");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("inytttttttt");
            }

        }
    }
}
