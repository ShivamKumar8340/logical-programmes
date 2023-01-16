package logicalProgrammesUsingProperMethode.stringProgramme;

public class StringReverse {

    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();
        System.out.println(stringReverse.reverseString("shiva"));
        stringReverse.ispalindrome("shiva");
        System.out.println(stringReverse.reverseSentence("My name is Shiva"));
        System.out.println(stringReverse.reverseSentencePosition("My Name is Shiva"));

    }

    String reverseString(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length()-1; i>=0; i--) {
            builder.append(str.charAt(i));
        }

        return builder.toString();
    }


    String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder revWord = new StringBuilder();
        for (String word : words) {
            revWord.append(reverseString(word)).append(" ");
        }
        return revWord.toString();
    }

    String reverseSentencePosition(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder revWord = new StringBuilder();
       for (int i = words.length-1; i>=0; i--) {
           revWord.append(words[i]).append(" ");
       }
        return revWord.toString();
    }



    // check ispalindrome
    void ispalindrome(String str) {
        String temp = str;
        String revWord = reverseString(str);
        if (temp.equals(revWord)){
            System.out.println("given String is palindrome");
        }
        else
            System.out.println("given String is not Palindrome");

    }

}
