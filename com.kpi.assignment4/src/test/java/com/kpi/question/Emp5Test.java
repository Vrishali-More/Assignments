package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */

public class Emp5Test {

	@Test
	public void testEmp5() {
		  Emp5 emp5 = new Emp5();
			
			// test for method salary
			 assertEquals(22000,emp5.salary(22000));
				System.out.println("Employee salary :"+emp5.salary(22000));
			
				// test for method name
				assertEquals("Gita", emp5.name("Gita"));
				System.out.println("Employee name:"+emp5.name("Gita"));
			
				// test for method Designation
				assertEquals("Schlor traniee", emp5.Designation("Schlor traniee"));
				System.out.println("Employee Designation:"+emp5.Designation("Schlor traniee"));
				
				// test for method address
				assertEquals("Pune", emp5.address("Pune"));
				System.out.println("Employee address:"+emp5.address("Pune"));
				
				// test for method companyName
				assertEquals("Wipro", emp5.companyName("Wipro"));
				System.out.println("Employee company Name:"+emp5.companyName("Wipro"));	
				
				// test for method email
				assertEquals("Gita@wipro.com", emp5.email("Gita@wipro.com"));
				System.out.println("Employee Email:"+emp5.email("Gita@wipro.com"));
				
				// test for method empid
				assertEquals(99,emp5.empid(99));
				System.out.println("Employee EmployeeId :"+emp5.empid(99));
				
				//test for method
				assertEquals("pune",emp5.workLocation("pune"));
				System.out.println("Employee Work Location :"+emp5.workLocation("pune"));
				
		
	}  
	}


