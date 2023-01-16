package constructorChaning.bySubClasses;

public class Base {
    String name;
    Base() {
        this("");
        System.out.println("calling no arg () of base class");
    }
    Base(String s) {
        this.name=s;
        System.out.println("calling arg () of base class ");
    }
}
