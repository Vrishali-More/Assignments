package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class Emp6Test {

	@Test
	public void testEmp6() {
         Emp6 emp6 = new Emp6();
		
		// test for method salary
		 assertEquals(10000,emp6.salary(10000));
			System.out.println("Employee salary :"+emp6.salary(10000));
		
			// test for method name
			assertEquals("Abc", emp6.name("Abc"));
			System.out.println("Employee name:"+emp6.name("Abc"));
		
			// test for method Designation
			assertEquals("Project traniee", emp6.Designation("Project traniee"));
			System.out.println("Employee Designation:"+emp6.Designation("Project traniee"));
			
			// test for method address
			assertEquals("Ahmednagar", emp6.address("Ahmednagar"));
			System.out.println("Employee address:"+emp6.address("Ahmednagar"));
			
			// test for method companyName
			assertEquals("KPI", emp6.companyName("KPI"));
			System.out.println("Employee company Name:"+emp6.companyName("KPI"));	
			
			// test for method email
			assertEquals("Abc@kpi.com", emp6.email("Abc@kpi.com"));
			System.out.println("Employee Email:"+emp6.email("Abc@kpi.com"));
			
			// test for method empid
			assertEquals(91,emp6.empid(91));
			System.out.println("Employee EmployeeId :"+emp6.empid(91));
			
			//test for method
			assertEquals("Hyd",emp6.workLocation("Hyd"));
			System.out.println("Employee Work Location :"+emp6.workLocation("Hyd"));
			
	}

}
