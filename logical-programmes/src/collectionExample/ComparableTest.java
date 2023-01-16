package collectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Employee> al = new ArrayList<>();
       al.add(new Employee(22,"shivam",2));
       al.add(new Employee(44,"amit",55));
       al.add(new Employee(66,"surendra",1));

        Collections.sort(al);
        for (Employee cd:al) {
            System.out.println(cd.id+", "+", "+cd.name+", "+cd.rollNo);
        }
    }
}
