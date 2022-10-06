package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class EmployeeInterface7Test {

	@Test
	public void test() {
    EmployeeInterface7 emp17=new EmployeeInterface7();
		
		// test for method empid
		assertEquals(7,emp17.empid(7));
		System.out.println("Employee id:"+emp17.empid(7));
		
		// test for method name
		assertEquals("Abc",emp17.name("Abc"));
		System.out.println("Employee name:"+emp17.name("Abc"));
		
		// test for method address
		assertEquals("Ahmednagar",emp17.address("Ahmednagar"));
		System.out.println("Employee Address:"+emp17.address("Ahmednagar"));
		
		// test for method companylocation
		assertEquals("Hyd",emp17.companylocation("Hyd"));
		System.out.println("Employee Company Location:"+emp17.companylocation("Hyd"));
		
		// test for method Designation
		assertEquals("project traniee",emp17.companylocation("project traniee"));
		System.out.println("Employee Designation :"+emp17.companylocation("project traniee"));
	    
		// test for method Salary
		assertEquals(18000,emp17.empid(18000));
		System.out.println("Employee Salary:"+emp17.Salary(18000));
		
		// test for method CompanyName
		assertEquals("KPI",emp17.CompanyName("KPI"));
		System.out.println("Employee Company Name:"+emp17.CompanyName("KPI"));
		
		// test for method CompanyAddress
		assertEquals("Hyd",emp17.companylocation("Hyd"));
		System.out.println("Employee Company Address:"+emp17.companylocation("Hyd"));
	
	}

}
