package array;

public class SecondMax {
    public static void main(String[] args) {
        int arr[] = {23, 34, 55,25,2,4};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                   arr[j+1] = temp;
                }
            }
        }

        System.out.println(arr[1]);

       /* for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
    }
}
