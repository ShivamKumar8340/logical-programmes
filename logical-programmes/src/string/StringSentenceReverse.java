package string;

public class StringSentenceReverse {
    public static void main(String[] args) {
        String str = "i love my india";
        String revStr ="";

        String words[] = str.split(" ");

        for (int i=0; i<words.length; i++) {
            String word = words[i];
          //  System.out.println(word);
            String revWord = "";

            for (int j= word.length()-1; j>=0; j--) {
                revWord=revWord+word.charAt(j);
            }
            //System.out.println(revWord);

            revStr  = revStr+revWord+" ";
        }
        System.out.println(revStr);
    }
}
