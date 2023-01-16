package collectionExample;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee> {
    public int id;
    public String name;
    public int rollNo;

    public Employee(int id, String name, int rollNo) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }



    @Override
    public int compareTo(Employee employee) {
        if (rollNo == employee.rollNo) {
            return 0;
        } else if (rollNo > employee.rollNo) {
            return 1;
        } else
            return -1;
    }
}