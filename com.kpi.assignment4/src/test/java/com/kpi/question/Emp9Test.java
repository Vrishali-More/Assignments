package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class Emp9Test {

	@Test
	public void testEmp9() {
		

		  Emp9 emp9 = new Emp9();
			
			// test for method salary
			 assertEquals(45000,emp9.salary(45000));
				System.out.println("Employee salary :"+emp9.salary(25000));
			
				// test for method name
				assertEquals("Rutu", emp9.name("Rutu"));
				System.out.println("Employee name:"+emp9.name("Rutu"));
			
				// test for method Designation
				assertEquals(" Manager", emp9.Designation(" Manager"));
				System.out.println("Employee Designation:"+emp9.Designation(" Manager"));
				
				// test for method address
				assertEquals("Ahmednagar", emp9.address("Ahmednagar"));
				System.out.println("Employee address:"+emp9.address("Ahmednagar"));
				
				// test for method companyName
				assertEquals("tcs", emp9.companyName("tcs"));
				System.out.println("Employee company Name:"+emp9.companyName("tcs"));	
				
				// test for method email
				assertEquals("Rutu@tcs.com", emp9.email("Rutu@tcs.com"));
				System.out.println("Employee Email:"+emp9.email("Rutu@tcs.com"));
				
				// test for method empid
				assertEquals(85,emp9.empid(85));
				System.out.println("Employee EmployeeId :"+emp9.empid(85));
				
				//test for method
				assertEquals("Bangloar",emp9.workLocation("Bangloar"));
				System.out.println("Employee Work Location :"+emp9.workLocation("Bangloar"));
				
		}
	 

}
