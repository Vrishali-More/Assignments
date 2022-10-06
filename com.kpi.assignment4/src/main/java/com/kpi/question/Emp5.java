package com.kpi.question;

/**
 * @author VrishaliMore
 *
 */
public class Emp5 extends Employee {


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
	
	// Thread display using Method References
			public static void division()
			{
				int a=4, b=2;
				System.out.println("Division is:"+(a/b));
			}
			public static void main(String args[]) {
			
				Thread t5= new Thread(Emp5::division);
				t5.start();
			}
}
