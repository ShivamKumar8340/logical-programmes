package pattern;

public class NumberPattern {
    public static void main(String[] args) {
        int value =1;
        for (int i=0; i<=5; i++) {
            for (int j =1; j<=i; j++) {
                System.out.print((value++) +" ");
            }
            System.out.println();
        }
    }
}
