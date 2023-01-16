package logicalProgrammesUsingProperMethode.arrayProgramme;

public class FindMinAndMax {

    public static void main(String[] args) {
        FindMinAndMax minAndMax = new FindMinAndMax();
        System.out.println("maximum number in the given array is : "+minAndMax.findMax(new int[]{1,2,4,5,6}));
        System.out.println("minimum number in the given array is : "+minAndMax.findMin(new int[]{1,2,4,5,6}));
        System.out.println("second max number in the given array is : "+minAndMax.findSecondMax(new int[]{2,4,5,87,65,6}));
        System.out.println("second minimum number in the given array is : "+minAndMax.findSecondMin(new int[]{1,2,4,5,6}));

    }
    // to find maximum
    int findMax(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    // to find minimum
    int findMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j<min) {
                min=j;
            }
        }
        return min;
    }

    // find second min
    int findSecondMin(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr[1];
    }

    // to find second max
    int findSecondMax(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            for (int j = 0; j<arr.length-i-1; j++) {
                if (arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr[1];
    }
}
