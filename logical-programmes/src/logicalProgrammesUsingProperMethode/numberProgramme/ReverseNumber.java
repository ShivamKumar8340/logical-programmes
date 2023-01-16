package logicalProgrammesUsingProperMethode.numberProgramme;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber number = new ReverseNumber();
        System.out.println(number.numberReverse(9099));
        number.checkPalindrome(9099);
    }
    int numberReverse(int num) {
        int rev = 0;
        for (int i=1; i<=num; i++ ) {
            int rem = num%10;
            rev = rev*10+rem;
            num= num/10;
        }
        return rev;
    }

    // to check palindrome
    void checkPalindrome(int num) {
        int temp = num;
        int revNum = numberReverse(num);
        if (revNum==temp) {
            System.out.println("number "+num+" is palindrome");
        }
        else
            System.out.println("number "+num+" is not palindrome");
    }
}
