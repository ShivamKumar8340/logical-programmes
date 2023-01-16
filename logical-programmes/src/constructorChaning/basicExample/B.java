package constructorChaning.basicExample;

public class B extends A{
    String name;


    public  B() {
        System.out.println("from B default constructor");
    }
    public B(String name) {
        System.out.println(name);
        System.out.println("from B");
    }


}
