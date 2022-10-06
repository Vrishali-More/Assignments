package com.kpi.question;

/**
 * @author VrishaliMore
 *
 */
public class Emp6 extends Employee {

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
			public static void Multiplication()
			{
				int a=8, b=2;
				System.out.println("Multiplication is:"+(a*b));
			}
			public static void main(String args[]) {
			
				Thread t6= new Thread(Emp6::Multiplication);
				t6.start();
			}
	
}
