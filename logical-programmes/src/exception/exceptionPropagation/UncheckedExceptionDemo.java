package exception.exceptionPropagation;

public class UncheckedExceptionDemo {
    void m() {
        int num = 29/0;
    }
    void n() {
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
        UncheckedExceptionDemo d = new UncheckedExceptionDemo();
        d.p();
        System.out.println("normal flow");
    }
}
