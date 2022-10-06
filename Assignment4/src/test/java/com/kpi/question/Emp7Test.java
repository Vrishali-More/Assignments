package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class Emp7Test {

	@Test
	public void test() {
		
		  Emp7 emp7 = new Emp7();
			
			// test for method salary
			 assertEquals(28000,emp7.salary(28000));
				System.out.println("Employee salary :"+emp7.salary(28000));
			
				// test for method name
				assertEquals("Nita", emp7.name("Nita"));
				System.out.println("Employee name:"+emp7.name("Nita"));
			
				// test for method Designation
				assertEquals("Schlor traniee", emp7.Designation("Schlor traniee"));
				System.out.println("Employee Designation:"+emp7.Designation("Schlor traniee"));
				
				// test for method address
				assertEquals("Pune", emp7.address("Pune"));
				System.out.println("Employee address:"+emp7.address("Pune"));
				
				// test for method companyName
				assertEquals("Infosys", emp7.companyName("Infosys"));
				System.out.println("Employee company Name:"+emp7.companyName("Infosys"));	
				
				// test for method email
				assertEquals("Nita@Infosys.com", emp7.email("Nita@Infosys.com"));
				System.out.println("Employee Email:"+emp7.email("Gita@Infosys.com"));
				
				// test for method empid
				assertEquals(991,emp7.empid(991));
				System.out.println("Employee EmployeeId :"+emp7.empid(991));
				
				//test for method
				assertEquals("Ahmednagar",emp7.workLocation("Ahmednagar"));
				System.out.println("Employee Work Location :"+emp7.workLocation("Ahmednagar"));
				

	
	}

}
