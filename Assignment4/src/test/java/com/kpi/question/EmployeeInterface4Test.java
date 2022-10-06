package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class EmployeeInterface4Test {

	@Test
	public void test() {
   EmployeeInterface4 emp14=new EmployeeInterface4();
		
		// test for method empid
		assertEquals(4,emp14.empid(4));
		System.out.println("Employee id:"+emp14.empid(4));
		
		// test for method name
		assertEquals("Rutu",emp14.name("Rutu"));
		System.out.println("Employee name:"+emp14.name("Rutu"));
		
		// test for method address
		assertEquals("Ahmednagar",emp14.address("Ahmednagar"));
		System.out.println("Employee Address:"+emp14.address("Ahmednagar"));
		
		// test for method companylocation
		assertEquals("Hyd",emp14.companylocation("Hyd"));
		System.out.println("Employee Company Location:"+emp14.companylocation("Hyd"));
		
		// test for method Designation
		assertEquals("traniee",emp14.companylocation("traniee"));
		System.out.println("Employee Designation :"+emp14.companylocation("traniee"));
	    
		// test for method Salary
		assertEquals(20000,emp14.empid(20000));
		System.out.println("Employee Salary:"+emp14.Salary(20000));
		
		// test for method CompanyName
		assertEquals("KPI",emp14.CompanyName("KPI"));
		System.out.println("Employee Company Name:"+emp14.CompanyName("KPI"));
		
		// test for method CompanyAddress
		assertEquals("Hyd",emp14.companylocation("Hyd"));
		System.out.println("Employee Company Address:"+emp14.companylocation("Hyd"));
	
	}

}
