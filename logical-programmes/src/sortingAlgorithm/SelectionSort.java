package sortingAlgorithm;

public class SelectionSort {
    public static void printArray(int a[]) {
        for (int i=0 ;i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,2,8,1};
       for (int i =0; i<arr.length; i++) {
           int smallest = i;
           for (int j =i+1; j<arr.length; j++ ) {
               if (arr[smallest]>arr[j]) {
                   smallest=j;
               }
           }
           int temp = arr[smallest];
           arr[smallest]=arr[i];
            arr[i]=temp;
       }
       printArray(arr);
    }
}
