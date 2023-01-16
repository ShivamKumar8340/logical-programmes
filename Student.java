 class Student implements Comparable<Student> {
	
	 int id;
	 String name;
	 int age;

	 Student(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age = age;
	}

	@Override
	public int compareTo(Student cd) {

		if(age==cd.age) {
			return 0;
		}
		else if(age>cd.age) {
			return 1; 
		}
		else {
			return -1;
		}
	}

}