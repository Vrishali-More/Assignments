package com.kpi.question5;

/**
 * @author VrishaliMore
 *
 */
public class Joker implements Joker1 {
	
	String Name;
	String dance;
	
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Joker";
	}
	

	@Override
	public String Dance() {
		// TODO Auto-generated method stub
		return "Dancing Joker with different types";
	}
	
	// constructor without argument
	Joker(){
		Name="NewCircus";
	}
	
	// constructor with argument
	Joker(String dance){

		this.dance=dance;
	}
	
	public static void main(String args[]) {
		Joker a1= new Joker();
		Joker a2 = new Joker();
		Joker a3 = new Joker();
		Joker a4 = new Joker();
		Joker a5 = new Joker();
		Joker a6 = new Joker();
		Joker a7 = new Joker();
		Joker a8 = new Joker();
		
		
		Joker j1= new Joker("Katthak");		
		Joker j2= new Joker("Bharatanatyam");		
		Joker j3= new Joker("Natpuja");
		Joker j4= new Joker("Loor");		
		Joker j5= new Joker("Bichhua");				
		Joker j6= new Joker("Kuchipudi");		
		Joker j7= new Joker("Kathakali");		
		Joker j8= new Joker("Kathak");
		
		
		System.out.println("Joker1 is dancing \t"+j1.dance);
		System.out.println("Joker2 is dancing \t"+j2.dance);
		System.out.println("Joker3 is dancing \t"+j3.dance);
		System.out.println("Joker4 is dancing \t"+j4.dance);
		System.out.println("Joker5 is dancing \t"+j5.dance);
		System.out.println("Joker6 is dancing \t"+j6.dance);
		System.out.println("Joker7 is dancing \t"+j7.dance);
		System.out.println("Joker8 is dancing \t"+j8.dance);
	
		
	}


}
