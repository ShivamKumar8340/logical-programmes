package constructorChaning;

public class WithInClassDemo {
    WithInClassDemo() {
        this(5);
        System.out.println("Default constructor ");
    }
    WithInClassDemo(int n) {
        this(3,4);
        System.out.println("1 arg constructor called : "+n);
    }
    WithInClassDemo(int a,int b) {
        System.out.println("2 args constructor called : "+a*b);
    }

    public static void main(String[] args) {
        WithInClassDemo withInClassDemo = new WithInClassDemo(3);

    }
}
