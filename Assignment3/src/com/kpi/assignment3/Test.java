package com.kpi.assignment3;

/**
 * @author VishaliMore
 *
 */
public class Test implements FunInterface, Saying{

	// method of Saying interface
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("Running now");
	}
	
	public static void main(String args[]) {
		Test t= new Test();
	      t.run();// calling nonfunctional interface
	      t.say();// calling say interface
	}



}
