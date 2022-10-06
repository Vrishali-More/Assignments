package com.kpi.question;

/**
 * @author VrishaliMore
 *
 */
public class Emp1 extends Employee {

	@Override
	int salary(int salary) {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	String name(String name) {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	String Designation(String designation) {
		// TODO Auto-generated method stub
		return designation;
	}

	@Override
	String address(String address) {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	String companyName(String companyName) {
		// TODO Auto-generated method stub
		return companyName;
	}

	@Override
	String email(String email) {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	int empid(int empid) {
		// TODO Auto-generated method stub
		return empid;
	}

	@Override
	String workLocation(String Location) {
		// TODO Auto-generated method stub
		return Location;
	}
	
	
	
	// Thread using Method References
	public static void status()
	{
		System.out.println("Thread is running");
	}
	public static void main(String args[]) {
	
		Thread t1= new Thread(Emp1::status);
		t1.start();
	}

}
