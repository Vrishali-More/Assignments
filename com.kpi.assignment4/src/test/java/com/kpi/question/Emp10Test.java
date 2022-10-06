package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class Emp10Test {

	@Test
	public void testEmp10() {
	
		 Emp10 emp10 = new Emp10();
			
			// test for method salary
			 assertEquals(55000,emp10.salary(55000));
				System.out.println("Employee salary :"+emp10.salary(55000));
			
				// test for method name
				assertEquals("Harikishnan", emp10.name("Harikishnan"));
				System.out.println("Employee name:"+emp10.name("Harikishnan"));
			
				// test for method Designation
				assertEquals("software engineer", emp10.Designation("software engineer"));
				System.out.println("Employee Designation:"+emp10.Designation("software engineer"));
				
				// test for method address
				assertEquals("Pune", emp10.address("Pune"));
				System.out.println("Employee address:"+emp10.address("Pune"));
				
				// test for method companyName
				assertEquals("Wipro", emp10.companyName("Wipro"));
				System.out.println("Employee company Name:"+emp10.companyName("Wipro"));	
				
				// test for method email
				assertEquals("Harikishnan@wipro.com", emp10.email("Harikishnan@wipro.com"));
				System.out.println("Employee Email:"+emp10.email("Harikishnan@wipro.com"));
				
				// test for method empid
				assertEquals(9999,emp10.empid(9999));
				System.out.println("Employee EmployeeId :"+emp10.empid(9999));
				
				//test for method
				assertEquals("Nashik",emp10.workLocation("Nashik"));
				System.out.println("Employee Work Location :"+emp10.workLocation("Nashik"));
				
		
		
	}

}
