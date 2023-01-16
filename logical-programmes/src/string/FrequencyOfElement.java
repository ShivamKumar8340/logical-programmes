package string;

public class FrequencyOfElement {
     static void countFrequency(String str) {
        int[] freq = new int[str.length()];
       char[] charString = str.toCharArray();

       for (int i=0; i<str.length(); i++) {
           freq[i]=1;
           for (int j=i+1; j<str.length(); j++) {
               if (charString[i]==charString[j]) {
                   freq[i]++;

                   charString[j]='0';
               }
           }

       }

       for (int i=0; i< freq.length; i++) {
           if (charString[i]!=' ' && charString[i]!='0') {
               System.out.println(charString[i]+" : " + freq[i]);
           }
       }

    }

    public static void main(String[] args) {
        FrequencyOfElement.countFrequency("Hello");
    }
}
