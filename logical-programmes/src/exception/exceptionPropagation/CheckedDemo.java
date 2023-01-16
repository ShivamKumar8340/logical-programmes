package exception.exceptionPropagation;

import java.io.IOException;

public class CheckedDemo {
    void m() throws IOException {
        throw new IOException("system error!");
    }
    void n() throws IOException {
        m();
    }
    void p() {
       try {
           n();
       } catch (Exception e) {
           System.out.println("Exception handled");
       }
    }

    public static void main(String[] args) {
        CheckedDemo demo = new CheckedDemo();
        demo.p();
    }
}
