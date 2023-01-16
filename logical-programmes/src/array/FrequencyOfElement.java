package array;

public class FrequencyOfElement {

    void countFrequency(int[] arr) {
        int[] freq = new int[arr.length];
        int visited = -1;

        for (int i =0; i<arr.length; i++) {
            int count = 1;
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i]==arr[j]) {
                    count++;
                    freq[j]=visited;
                }
            }
            if (freq[i]!=visited) {
                freq[i]=count;
            }
         }

        System.out.println("frequency of each element in array");
        for (int i =0; i< arr.length; i++) {
            if (freq[i]!=visited) {
                System.out.println(arr[i]+" occurs  "+freq[i]+" times");
            }
        }
    }

    public static void main(String[] args) {
        FrequencyOfElement element = new FrequencyOfElement();
        element.countFrequency(new int[]{1,1,2,2,3,4,5,6,6,6});
    }
}
