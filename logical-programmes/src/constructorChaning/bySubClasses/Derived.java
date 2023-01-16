package constructorChaning.bySubClasses;

public class Derived extends Base{
    Derived() {

        System.out.println("calling no arg () of derived class");
    }

    Derived(String str) {
        super(str);
        System.out.println("calling arg () of derived class");
    }

    public static void main(String[] args) {
        new Derived();
    }
}
