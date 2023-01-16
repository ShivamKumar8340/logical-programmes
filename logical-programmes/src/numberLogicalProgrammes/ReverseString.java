package numberLogicalProgrammes;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "shivam";
        String rev = "";
        String temp = s1;
        for (int i = s1.length()-1;i>=0;i--) {
            rev = rev+s1.charAt(i);
        }
        System.out.println("revsere of given String is:"+rev);
        // to check Palindrome
        if (temp.equals(rev)) {
            System.out.println("given String is Palindrome ");
        }
        else {
            System.out.println("given String is not Palindrome ");
        }
    }
}
