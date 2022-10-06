package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class Emp2Test {

	@Test
	public void testEmp2() {
		
       Emp2 emp2 = new Emp2();
		
		// test for method salary
		 assertEquals(15000,emp2.salary(15000));
			System.out.println("Employee salary :"+emp2.salary(15000));
		
			// test for method name
			assertEquals("Abhi", emp2.name("Abhi"));
			System.out.println("Employee name:"+emp2.name("Abhi"));
		
			// test for method Designation
			assertEquals(" traniee", emp2.Designation(" traniee"));
			System.out.println("Employee Designation:"+emp2.Designation(" traniee"));
			
			// test for method address
			assertEquals("Ahmednagar", emp2.address("Ahmednagar"));
			System.out.println("Employee address:"+emp2.address("Ahmednagar"));
			
			// test for method companyName
			assertEquals("Hexware", emp2.companyName("Hexware"));
			System.out.println("Employee company Name:"+emp2.companyName("Hexware"));	
			
			// test for method email
			assertEquals("Abhi@hexware.com", emp2.email("Abhi@hexware.com"));
			System.out.println("Employee Email:"+emp2.email("Abhi@hexware.com"));
			
			// test for method empid
			assertEquals(111,emp2.empid(111));
			System.out.println("Employee EmployeeId :"+emp2.empid(111));
			
			//test for method
			assertEquals("pune",emp2.workLocation("pune"));
			System.out.println("Employee Work Location :"+emp2.workLocation("pune"));
			
	}
 
		
		
	}


