package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
	
	int empId;
	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	String name;
	String dept;
	
	public Employee(int empId, String name, String dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept
				+ "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee em1 = new Employee(10,"jyoti","IT");
		Employee em2 = new Employee(30,"Sandeep","IT");
		Employee em3 = new Employee(20,"Manas","Admin");
		Employee em4 = new Employee(40,"Nihar","finance");
		
		List<Employee> EmpList = new ArrayList<Employee>();
		
		EmpList.add(em1);
		EmpList.add(em2);
		EmpList.add(em3);
		EmpList.add(em4);
		
		System.out.println("values before sorting-->"+ EmpList);
		
		Collections.sort(EmpList,new Comparator<Employee>()
		{
			public int compare(Employee e1, Employee e2)
			{
				return (e1.getEmpId()) - (e2.getEmpId());
			}
			
		}
					
				);
		System.out.println("values after sorting-->"+ EmpList);
		
		
		
				
		

	}

}
