package collectionExample;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(3,"shivam",19));
        al.add(new Student(1,"hari",45));
        al.add(new Student(5,"ravi",22));

        System.out.println("Sorting by name");
        Collections.sort(al,new NameComparator());
        for (Student s:al) {
            System.out.println(s.id+", "+", "+s.name+", "+s.age);
        }

        System.out.println("Sorting by age");
        Collections.sort(al,new AgeComparator());
        for (Student s:al) {
            System.out.println(s.id+", "+", "+s.name+", "+s.age);
        }

    }
}
