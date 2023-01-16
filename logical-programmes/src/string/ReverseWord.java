package string;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "i love my india";

        String words[] = str.split(" ");

        for (int i = words.length-1; i>=0; i--) {

            System.out.print(words[i]+" ");
        }

    }
}
