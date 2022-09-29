package com.kpi.assignment3;

public class Cat extends Animal {

	@Override
	void color() {
		// TODO Auto-generated method stub
		System.out.println("White");
	}

	@Override
	void legs() {
		// TODO Auto-generated method stub
		System.out.println("Cat having 4 legs");
	}
	public static void main(String args[]) {
		Cat c = new Cat();
		c.color();
		c.legs();
		
	}

}
