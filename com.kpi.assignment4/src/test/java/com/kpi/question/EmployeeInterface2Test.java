package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class EmployeeInterface2Test {

	@Test
	public void testemp11() {
	
		EmployeeInterface2 emp12=new EmployeeInterface2();
		
		// test for method empid
		assertEquals(2,emp12.empid(2));
		System.out.println("Employee id:"+emp12.empid(2));
		
		// test for method name
		assertEquals("Vrishali",emp12.name("Vrishali"));
		System.out.println("Employee name:"+emp12.name("Vrishali"));
		
		// test for method address
		assertEquals("Ahmednagar",emp12.address("Ahmednagar"));
		System.out.println("Employee Address:"+emp12.address("Ahmednagar"));
		
		// test for method companylocation
		assertEquals("Pune",emp12.companylocation("Pune"));
		System.out.println("Employee Company Location:"+emp12.companylocation("Pune"));
		
		// test for method Designation
		assertEquals("traniee",emp12.companylocation("traniee"));
		System.out.println("Employee Designation :"+emp12.companylocation("traniee"));
	    
		// test for method Salary
		assertEquals(15000,emp12.empid(15000));
		System.out.println("Employee Salary:"+emp12.Salary(15000));
		
		// test for method CompanyName
		assertEquals("KPI",emp12.CompanyName("KPI"));
		System.out.println("Employee Company Name:"+emp12.CompanyName("KPI"));
		
		// test for method CompanyAddress
		assertEquals("Hyd",emp12.companylocation("Hyd"));
		System.out.println("Employee Company Address:"+emp12.companylocation("Hyd"));
	
	}
	}


