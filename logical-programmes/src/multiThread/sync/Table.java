package multiThread.sync;

public class Table {
    //we can use synchronized methode like
    // public synchronized void printTable(int n){};
    public void printTable(int n) {
        // synchronized block
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
