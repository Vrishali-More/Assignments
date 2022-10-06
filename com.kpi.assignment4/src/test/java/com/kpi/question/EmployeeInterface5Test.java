package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class EmployeeInterface5Test {

	@Test
	public void test() {
   EmployeeInterface5 emp15=new EmployeeInterface5();
		
		// test for method empid
		assertEquals(5,emp15.empid(5));
		System.out.println("Employee id:"+emp15.empid(5));
		
		// test for method name
		assertEquals("Xyz",emp15.name("Xyz"));
		System.out.println("Employee name:"+emp15.name("Xyz"));
		
		// test for method address
		assertEquals("Ahmednagar",emp15.address("Ahmednagar"));
		System.out.println("Employee Address:"+emp15.address("Ahmednagar"));
		
		// test for method companylocation
		assertEquals("Pune",emp15.companylocation("Pune"));
		System.out.println("Employee Company Location:"+emp15.companylocation("Pune"));
		
		// test for method Designation
		assertEquals(" traniee",emp15.companylocation(" traniee"));
		System.out.println("Employee Designation :"+emp15.companylocation(" traniee"));
	    
		// test for method Salary
		assertEquals(15000,emp15.empid(15000));
		System.out.println("Employee Salary:"+emp15.Salary(15000));
		
		// test for method CompanyName
		assertEquals("wipro",emp15.CompanyName("wipro"));
		System.out.println("Employee Company Name:"+emp15.CompanyName("wipro"));
		
		// test for method CompanyAddress
		assertEquals("pune",emp15.companylocation("pune"));
		System.out.println("Employee Company Address:"+emp15.companylocation("pune"));
	
	}

}
