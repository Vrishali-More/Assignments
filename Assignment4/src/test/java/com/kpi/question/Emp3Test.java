package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class Emp3Test {

	@Test
	public void testEmp3() {
		
		  Emp3 emp3 = new Emp3();
			
			// test for method salary
			 assertEquals(25000,emp3.salary(25000));
				System.out.println("Employee salary :"+emp3.salary(25000));
			
				// test for method name
				assertEquals("Ram", emp3.name("Ram"));
				System.out.println("Employee name:"+emp3.name("Ram"));
			
				// test for method Designation
				assertEquals(" traniee", emp3.Designation(" traniee"));
				System.out.println("Employee Designation:"+emp3.Designation(" traniee"));
				
				// test for method address
				assertEquals("Ahmednagar", emp3.address("Ahmednagar"));
				System.out.println("Employee address:"+emp3.address("Ahmednagar"));
				
				// test for method companyName
				assertEquals("Hexware", emp3.companyName("Hexware"));
				System.out.println("Employee company Name:"+emp3.companyName("Hexware"));	
				
				// test for method email
				assertEquals("Ram@hexware.com", emp3.email("Ram@hexware.com"));
				System.out.println("Employee Email:"+emp3.email("Ram@hexware.com"));
				
				// test for method empid
				assertEquals(101,emp3.empid(101));
				System.out.println("Employee EmployeeId :"+emp3.empid(101));
				
				//test for method
				assertEquals("pune",emp3.workLocation("pune"));
				System.out.println("Employee Work Location :"+emp3.workLocation("pune"));
				
		}
	 
		
	}


