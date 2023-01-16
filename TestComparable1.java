import java.util.*;
public class TestComparable1 {
	public static void main(String args[]) {
		List<Student> al= new ArrayList<Student>();
		al.add(new Student(24,"shivam",33));
		al.add(new Student(20,"amit",88));
		al.add(new Student(29,"surendra",77));

		Collections.sort(al);
		for(Student ct:al) {
			System.out.println(ct.id+", "+ct.name+", "+ct.age);
		}


	}

}