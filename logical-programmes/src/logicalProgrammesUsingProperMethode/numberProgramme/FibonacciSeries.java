package logicalProgrammesUsingProperMethode.numberProgramme;

public class FibonacciSeries {

    public static void main(String[] args) {
        FibonacciSeries series = new FibonacciSeries();
        series.fibonacci(10);
    }

        void fibonacci(int num) {
            int num1=0; int num2=1;
            int count = 0;
            while (count<num) {
                System.out.print(num1+", ");
               int num3=num1+num2;
               num1=num2;
               num2=num3;
               count++;
            }

        }

}
