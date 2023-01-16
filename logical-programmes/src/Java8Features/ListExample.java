package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("shivam","surendra","amit","aditya","ravi");
        List<Integer> list1 = Arrays.asList(12,2,1,2,3,23,4,42,43,43,4,5,5,3);


     List<String> str =   list.stream().
        filter(n->n.startsWith("s"))
                .collect(Collectors.toList());
        System.out.println(str);

     list1.stream().filter(n->n>10)
             .forEach(num-> System.out.println(num));


    }
}
