package numberLogicalProgrammes;

public class PrimeNumberDemo {
    public static void main(String[] args) {

        int temp = 0 ;
        int num = 11;
        if (num==0||num==1) {
            System.out.println(num+" is not prime number");
        }
        else {
            for (int i = 2; i <=num/2; i++) {
                if (num % i == 0) {
                    System.out.println(num + "  is not prime number");
                    temp = 1;
                    break;
                }
            }
        }
            if (temp == 0) {
                System.out.println(num + " is prime number");

            }
    }
}
