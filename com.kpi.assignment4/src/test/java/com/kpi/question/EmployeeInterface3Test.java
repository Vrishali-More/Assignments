package com.kpi.question;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author VrishaliMore
 *
 */
public class EmployeeInterface3Test {

	@Test
	public void test() {
		
		EmployeeInterface3 emp13=new EmployeeInterface3();

		
		// test for method empid
				assertEquals(3,emp13.empid(3));
				System.out.println("Employee id:"+emp13.empid(3));
				
				// test for method name
				assertEquals("Ram",emp13.name("Ram"));
				System.out.println("Employee name:"+emp13.name("Ram"));
				
				// test for method address
				assertEquals("Pune",emp13.address("Pune"));
				System.out.println("Employee Address:"+emp13.address("Pune"));
				
				// test for method companylocation
				assertEquals("Pune",emp13.companylocation("Pune"));
				System.out.println("Employee Company Location:"+emp13.companylocation("Pune"));
				
				// test for method Designation
				assertEquals("traniee",emp13.companylocation("traniee"));
				System.out.println("Employee Designation :"+emp13.companylocation("traniee"));
			    
				// test for method Salary
				assertEquals(15000,emp13.empid(15000));
				System.out.println("Employee Salary:"+emp13.Salary(15000));
				
				// test for method CompanyName
				assertEquals("Hexware",emp13.CompanyName("Hexware"));
				System.out.println("Employee Company Name:"+emp13.CompanyName("Hexware"));
				
				// test for method CompanyAddress
				assertEquals("Pune",emp13.companylocation("Pune"));
				System.out.println("Employee Company Address:"+emp13.companylocation("Pune"));
			
			}
		
	}


