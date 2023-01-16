package numberLogicalProgrammes;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 232;
        int rev = 0;
        int temp = num;
        while (num>0) {
            int remainder = num%10;
            rev = rev*10+remainder;
            num= num/10;
        }
        System.out.println("reverse number of given number is :" +rev);
        // to check palindrome
        if (temp==rev) {
            System.out.println("given number is Palindrome");
        }
        else {
            System.out.println("given number is not Palindrome");
        }
    }
}
