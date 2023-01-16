package string;

public class ConcatDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "java";

        String s3 =s1.concat("@").concat(s2);
        System.out.println(s3);
    }
}
