package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class Emp4Test {

	@Test
	public void testEmp4() {
		
		  Emp4 emp4 = new Emp4();
			
			// test for method salary
			 assertEquals(20000,emp4.salary(20000));
				System.out.println("Employee salary :"+emp4.salary(20000));
			
				// test for method name
				assertEquals("Sham", emp4.name("Sham"));
				System.out.println("Employee name:"+emp4.name("Sham"));
			
				// test for method Designation
				assertEquals("Senior traniee", emp4.Designation("Senior traniee"));
				System.out.println("Employee Designation:"+emp4.Designation(" Senior traniee"));
				
				// test for method address
				assertEquals("Pune", emp4.address("Pune"));
				System.out.println("Employee address:"+emp4.address("Pune"));
				
				// test for method companyName
				assertEquals("Kpi", emp4.companyName("Kpi"));
				System.out.println("Employee company Name:"+emp4.companyName("Kpi"));	
				
				// test for method email
				assertEquals("Sham@kpi.com", emp4.email("Sham@kpi.com"));
				System.out.println("Employee Email:"+emp4.email("Sham@kpi.com"));
				
				// test for method empid
				assertEquals(10,emp4.empid(10));
				System.out.println("Employee EmployeeId :"+emp4.empid(10));
				
				//test for method
				assertEquals("pune",emp4.workLocation("pune"));
				System.out.println("Employee Work Location :"+emp4.workLocation("pune"));
				
		
	}

}
