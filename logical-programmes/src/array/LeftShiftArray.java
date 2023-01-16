package array;

public class LeftShiftArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int num = 3;

        for (int i = 0; i<num; i++) {

            int first,j;
            first = arr[0];
            for (j = 0; j< arr.length-1; j++) {
                arr[j]=arr[j+1];

            }
                arr[j]  = first;
        }

        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+ ", ");
        }
    }
}
