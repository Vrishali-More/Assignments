package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class Emp8Test {

	@Test
	public void testEmp8() {
	
    Emp8 emp8 = new Emp8();
		
		// test for method salary
		 assertEquals(35000,emp8.salary(35000));
			System.out.println("Employee salary :"+emp8.salary(35000));
		
			// test for method name
			assertEquals("Xyz", emp8.name("Xyz"));
			System.out.println("Employee name:"+emp8.name("Xyz"));
		
			// test for method Designation
			assertEquals(" traniee", emp8.Designation(" traniee"));
			System.out.println("Employee Designation:"+emp8.Designation(" traniee"));
			
			// test for method address
			assertEquals("Ahmednagar", emp8.address("Ahmednagar"));
			System.out.println("Employee address:"+emp8.address("Ahmednagar"));
			
			// test for method companyName
			assertEquals("Hexware", emp8.companyName("Hexware"));
			System.out.println("Employee company Name:"+emp8.companyName("Hexware"));	
			
			// test for method email
			assertEquals("xyz@hexware.com", emp8.email("xyz@hexware.com"));
			System.out.println("Employee Email:"+emp8.email("xyz@hexware.com"));
			
			// test for method empid
			assertEquals(119,emp8.empid(119));
			System.out.println("Employee EmployeeId :"+emp8.empid(119));
			
			//test for method
			assertEquals("pune",emp8.workLocation("pune"));
			System.out.println("Employee Work Location :"+emp8.workLocation("pune"));
			
	}
 
		
	}


