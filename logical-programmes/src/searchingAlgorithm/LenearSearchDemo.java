package searchingAlgorithm;

public class LenearSearchDemo {
    public static void main(String[] args) {
        int arr[] = {2,7,9,351,1,78,2};
        int num = 78;

        for (int i=0;i<arr.length;i++) {
            if (arr[i]==num) {
                System.out.println("given number is found at index : "+i);
            }
        }
    }
}
