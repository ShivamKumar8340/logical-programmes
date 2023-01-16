package collectionExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {

    public static void main(String[] args) {
       List<Integer> alist = Arrays.asList(1,5,43,6,8,35,45,34,5,45,46);

       // Sorting Using stream api
     List<Integer> list =  alist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted list in descending order : "+list);

        // using collections class methode

        Collections.sort(alist);
        System.out.println("Sorted list in ascending Order"+alist);


        /*
        find max
         */

       Integer max = alist.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("max value :"+ max);

        /*
        min value
         */
         Integer min = alist.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("min value : "+ min);

        /*
        second max
         */

      Integer secondMax =   alist.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("Second Max : "+secondMax);


        /*
        second min
         */
        Integer secondMin =   alist.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second Min : "+secondMin);

        /* sorting of array
        */
        int[] arr = {2,4,5,61,67,4,3,23};
        Arrays.sort(arr);


        System.out.print("Sorted Array : ");
        for (int i : arr) {
            System.out.print(i+", ");
        }
        System.out.println();


    }
}
