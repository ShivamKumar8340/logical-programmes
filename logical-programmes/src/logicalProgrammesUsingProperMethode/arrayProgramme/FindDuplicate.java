package logicalProgrammesUsingProperMethode.arrayProgramme;

public class FindDuplicate {
    public static void main(String[] args) {
        FindDuplicate findDuplicate = new FindDuplicate();
        findDuplicate.getDuplicate(new int[]{4,1,3,5,4,5});
    }
    void getDuplicate(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j =i+1; j<arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
