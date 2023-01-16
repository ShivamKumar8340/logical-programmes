package sortingAlgorithm;

public class BubbleSort {
    public static void printArray(int a[]) {
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,3,34,5,6,14};
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0;j<arr.length-i-1;j++) {
                if (arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        printArray(arr);
    }
}

