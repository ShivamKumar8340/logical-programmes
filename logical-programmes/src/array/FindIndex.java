package array;

public class FindIndex {
    public static void main(String[] args) {
        int arr[] = {1,23,3,34,4,5};
        int num = 23;
        for (int i= 0; i<arr.length; i++) {
            if (arr[i]==num) {
                System.out.println("given number found at index :" +i);
            }
        }
    }
}
