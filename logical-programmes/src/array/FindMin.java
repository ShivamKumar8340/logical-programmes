package array;

public class FindMin {
    public static void main(String[] args) {
        int arr[] = {32,45,24,3,4};
        int min = arr[0];
        for (int i =1; i<arr.length;i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
