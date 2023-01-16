package logicalProgrammesUsingProperMethode.numberProgramme;

public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.calculatefactorial(6));
    }
    int calculatefactorial(int num) {
        int fact = 1;
        while (num>0) {
            fact = fact*num;
            num--;
        }
        return fact;
    }
}
