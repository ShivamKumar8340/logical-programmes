package exception.deadLock;

public class DeadLockDemo {
    public static void main(String[] args) {
       String resource1 = "Shivam";
       String resource2 = "Amit";

        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1 locked resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1 locked resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2 locked resource 2");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2 locked resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();

    }
}
