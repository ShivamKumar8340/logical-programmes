package array;

public class FindMax {

    public static void main(String[] args) {
        int arr[] = {23,42,4,5,65,75,4555};
        int max = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
