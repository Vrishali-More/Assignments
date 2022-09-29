package com.kpi.assignment3;

/**
 * @author VishaliMore
 *
 */

// 2) way to use functionalInterface
//functional Interface is extending to a non-functional interface
// and implementing Test class

@FunctionalInterface

interface Saying {
	void say();
}

public interface FunInterface extends Saying {
	
default void run() {
	System.out.println("Running"); 
	
}

}


		
	
