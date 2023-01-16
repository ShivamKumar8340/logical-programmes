package constructorChaning.basicExample;


public class Test {

    public static void main(String[] args) {


        double p = 10000;
        double rate = 10;
        double time = 2;
        int num = 3;

        double ci = p * (Math.pow((1 + rate / 100), (num * time))) - p;

        System.out.println(ci);
    }
}
