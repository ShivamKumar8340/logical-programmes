package searchingAlgorithm;

public class BinarySerachDemo {
    public static void main(String[] args) {
        int arr[] = {5, 11, 34, 45, 56, 68, 89, 99};
        int num = 45;
        int lowest = 0;
        int higest = arr.length-1;
        int mid = (lowest + higest)/ 2;

        while (lowest <= higest) {
            if (arr[mid] == num) {
                System.out.println("given number is found at index : " + mid);
                break;
            } else if (arr[mid] < num) {
                lowest = mid + 1;
            } else {
                higest = mid - 1;
            }
            mid = (lowest + higest) / 2;
        }
    }
}
