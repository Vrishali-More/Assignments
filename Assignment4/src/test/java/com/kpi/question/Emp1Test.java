package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class Emp1Test {

	@Test
	public void testEmp1() {
		
		Emp1 emp = new Emp1();
		
		// test for method salary
		 assertEquals(10000,emp.salary(10000));
			System.out.println("Employee salary :"+emp.salary(10000));
		
			// test for method name
			assertEquals("Vrishali", emp.name("Vrishali"));
			System.out.println("Employee name:"+emp.name("Vrishali"));
		
			// test for method Designation
			assertEquals("Project traniee", emp.Designation("Project traniee"));
			System.out.println("Employee Designation:"+emp.Designation("Project traniee"));
			
			// test for method address
			assertEquals("Ahmednagar", emp.address("Ahmednagar"));
			System.out.println("Employee address:"+emp.address("Ahmednagar"));
			
			// test for method companyName
			assertEquals("KPI", emp.companyName("KPI"));
			System.out.println("Employee company Name:"+emp.companyName("KPI"));	
			
			// test for method email
			assertEquals("vrishali@kpi.com", emp.email("vrishali@kpi.com"));
			System.out.println("Employee Email:"+emp.email("vrishli@kpi.com"));
			
			// test for method empid
			assertEquals(11,emp.empid(11));
			System.out.println("Employee EmployeeId :"+emp.empid(11));
			
			//test for method
			assertEquals("Hyd",emp.workLocation("Hyd"));
			System.out.println("Employee Work Location :"+emp.workLocation("Hyd"));
			
	}
 
}
