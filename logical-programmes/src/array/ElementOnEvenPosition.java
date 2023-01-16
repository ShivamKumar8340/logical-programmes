package array;

public class ElementOnEvenPosition {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};

        System.out.println("element on Even position");
        for (int i=1; i<arr.length; i=i+2) {
            System.out.println(arr[i]+" ");
        }

        System.out.println("element on Odd position");
        for (int i=0;i< arr.length;i=i+2) {
            System.out.println(arr[i]+" ");
        }
    }
}
