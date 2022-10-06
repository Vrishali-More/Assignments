package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class EmployeeInterface8Test {

	@Test
	public void testemployee() {
    EmployeeInterface8 emp18=new EmployeeInterface8();
		
		// test for method empid
		assertEquals(8,emp18.empid(8));
		System.out.println("Employee id:"+emp18.empid(8));
		
		// test for method name
		assertEquals("Sham",emp18.name("Sham"));
		System.out.println("Employee name:"+emp18.name("Sham"));
		
		// test for method address
		assertEquals("Pune",emp18.address("Pune"));
		System.out.println("Employee Address:"+emp18.address("Pune"));
		
		// test for method companylocation
		assertEquals("Pune",emp18.companylocation("Pune"));
		System.out.println("Employee Company Location:"+emp18.companylocation("Pune"));
		
		// test for method Designation
		assertEquals("project traniee",emp18.companylocation("project traniee"));
		System.out.println("Employee Designation :"+emp18.companylocation("project traniee"));
	    
		// test for method Salary
		assertEquals(15000,emp18.empid(15000));
		System.out.println("Employee Salary:"+emp18.Salary(15000));
		
		// test for method CompanyName
		assertEquals("KPI",emp18.CompanyName("KPI"));
		System.out.println("Employee Company Name:"+emp18.CompanyName("KPI"));
		
		// test for method CompanyAddress
		assertEquals("Hyd",emp18.companylocation("Hyd"));
		System.out.println("Employee Company Address:"+emp18.companylocation("Hyd"));
	
	}

}
