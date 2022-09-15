package OopsAssignment10;

import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		  e.setEmpid(101);
		  e.setEmpname("Shubham");
		  e.setEmpsalary(200000);
		  e.setEmpaddress("pune");
		  e.setEmp_dob(new Date(24-8-2022));
		  e.setEmp_doj(new Date(24-8-2022));
		  
		  System.out.println(e);
	}

}
