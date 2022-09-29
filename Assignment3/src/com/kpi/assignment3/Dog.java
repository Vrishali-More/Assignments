package com.kpi.assignment3;

/**
 * @author VishaliMore
 *
 */
public class Dog extends Animal {

	@Override
	void color() {
		// TODO Auto-generated method stub
		System.out.println("Black");
	}

	@Override
	void legs() {
		// TODO Auto-generated method stub
		System.out.println(" Dog having 4 legs");
	}
	
	public static void main(String args[]) {
		Dog d = new Dog();
		d.color();
		d.legs();
		
	}

}
