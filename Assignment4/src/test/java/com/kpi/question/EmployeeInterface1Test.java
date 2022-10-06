package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class EmployeeInterface1Test {

	@Test
	public void testemp() {
		EmployeeInterface1 emp11=new EmployeeInterface1();
		
		// test for method empid
		assertEquals(1,emp11.empid(1));
		System.out.println("Employee id:"+emp11.empid(1));
		
		// test for method name
		assertEquals("Vrishali",emp11.name("Vrishali"));
		System.out.println("Employee name:"+emp11.name("Vrishali"));
		
		// test for method address
		assertEquals("Ahmednagar",emp11.address("Ahmednagar"));
		System.out.println("Employee Address:"+emp11.address("Ahmednagar"));
		
		// test for method companylocation
		assertEquals("Hyd",emp11.companylocation("Hyd"));
		System.out.println("Employee Company Location:"+emp11.companylocation("Hyd"));
		
		// test for method Designation
		assertEquals("project traniee",emp11.companylocation("project traniee"));
		System.out.println("Employee Designation :"+emp11.companylocation("project traniee"));
	    
		// test for method Salary
		assertEquals(10000,emp11.empid(10000));
		System.out.println("Employee Salary:"+emp11.Salary(10000));
		
		// test for method CompanyName
		assertEquals("KPI",emp11.CompanyName("KPI"));
		System.out.println("Employee Company Name:"+emp11.CompanyName("KPI"));
		
		// test for method CompanyAddress
		assertEquals("Hyd",emp11.companylocation("Hyd"));
		System.out.println("Employee Company Address:"+emp11.companylocation("Hyd"));
	
	}

}
 