package array;

public class FindMissingElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7};
        int expectedLenth = arr.length+1;
        int total = expectedLenth * (expectedLenth+1)/2;

        int sum = 0;
        for (int i = 0; i<arr.length; i++) {
            sum= sum+arr[i];
        }

        System.out.println("missing number in given array is :" +(total-sum));
    }
}
