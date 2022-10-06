package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class EmployeeInterface6Test {

	@Test
	public void emptest() {
     EmployeeInterface6 emp16=new EmployeeInterface6();
		
		// test for method empid
		assertEquals(6,emp16.empid(6));
		System.out.println("Employee id:"+emp16.empid(1));
		
		// test for method name
		assertEquals("Abhi",emp16.name("Abhi"));
		System.out.println("Employee name:"+emp16.name("Abhi"));
		
		// test for method address
		assertEquals("Ahmednagar",emp16.address("Ahmednagar"));
		System.out.println("Employee Address:"+emp16.address("Ahmednagar"));
		
		// test for method companylocation
		assertEquals("Hyd",emp16.companylocation("Hyd"));
		System.out.println("Employee Company Location:"+emp16.companylocation("Hyd"));
		
		// test for method Designation
		assertEquals("project traniee",emp16.companylocation("project traniee"));
		System.out.println("Employee Designation :"+emp16.companylocation("project traniee"));
	    
		// test for method Salary
		assertEquals(10000,emp16.empid(10000));
		System.out.println("Employee Salary:"+emp16.Salary(10000));
		
		// test for method CompanyName
		assertEquals("KPI",emp16.CompanyName("KPI"));
		System.out.println("Employee Company Name:"+emp16.CompanyName("KPI"));
		
		// test for method CompanyAddress
		assertEquals("Hyd",emp16.companylocation("Hyd"));
		System.out.println("Employee Company Address:"+emp16.companylocation("Hyd"));
	
	}

}
