package Assignment9;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		

	       Employee e1 = new Employee(201, "shubham", 1000, "Hr", "jalgaon");
	        Employee e2 = new Employee(202, "sumit", 2000, "software", "amravti");
	        Employee e3 = new Employee(203, "tushar", 2300, "IT4", "mumbai");
	        Employee e4 = new Employee(204, "akash", 5000, "Admin", "pune");
	        Employee e5 = new Employee(205, "raju", 4000, "It1", "mumbai");
	        Employee e6 = new Employee(206, "ram", 10000, "It2", "jalgaon");
	        Employee e7 = new Employee(207, "sham", 17990, "It3", "mumbai");
	        Employee e8 = new Employee(208, "lavish", 12000, "Admin", "mumbai");
	        Employee e9 = new Employee(209, "ramdev", 7000, "It", "mumbai");
	        Employee e10 = new Employee(210, "sahdev", 8400, "software", "pune");



	       Set<Employee> list = new HashSet<>();
	        list.add(e1);
	        list.add(e2);
	        list.add(e3);
	        list.add(e4);
	        list.add(e5);
	        list.add(e6);
	        list.add(e7);
	        list.add(e8);
	        list.add(e9);
	        list.add(e10);

	       for (Employee e : list) {
	            System.out.println(e);
	        }
	    }
	

}
