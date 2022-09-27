package Assignment;
// we create a class Account and make their 3 Constructor and 5 object
public class Account {
	int number;
	String Name;
	
	Account ()// constructor 1
	{
		System.out.println("This is account constructor");
	}
	Account(int num){ // constructor 2 having paremeter num
		
		 number = num ;
	}
	Account(int num, String name){ // constructor 3 having two parameters num and name
		
		number=num;
		Name = name;
	}
	void display() {
		System.out.println(number +" \t "+Name);
	}
	
	public static void main (String args[]) {
		
		
	    //   constructor 5 object
	    System.out.println("Constructor Name and number");
	    Account ac1=new Account(1,"abc");
	    Account ac2=new Account(2,"def");
	    Account ac3=new Account(3,"ghi");
	    Account ac4=new Account(4,"stu");
	    Account ac5=new Account(5,"xyz");
	    ac1.display();
	    ac2.display();
	    ac3.display();
	    ac4.display();
	    ac5.display();
	    
	
	
	}
 
}
