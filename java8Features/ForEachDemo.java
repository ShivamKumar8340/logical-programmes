import java.util.*;
class ForEachDemo {
	public static void main(String args[]) {
	List <String> names = new ArrayList<>();
	names.add("Shivam");
	names.add("Surendra");
	names.add("Amit");

	names.forEach(name->System.out.println(name));

	}
}