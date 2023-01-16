package logicalProgrammesUsingProperMethode.numberProgramme;

public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber number = new PrimeNumber();
        number.isPrime(14);
    }

    void isPrime(int num) {
        int temp = 0;
        if (num == 0 || num == 1) {
            System.out.println("num is not prime");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println("num is not prime");
                    temp = 1;
                    break;
                }
            }
        }
        if (temp==0) {
            System.out.println("num is prime");
        }
    }
}
