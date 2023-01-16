package array;

public class FindDuplicate {
    public static void main(String[] args) {

    int arr[] = {1, 1, 13, 3, 4, 5, 3, 8, 8, 99};
        System.out.println("Duplicate element in given array");
    for (int i=0; i<arr.length; i++) {
        for (int j=i+1; j< arr.length; j++) {
            if (arr[i]==arr[j]) {
                System.out.println(arr[j]);
            }
        }
    }
}
}
