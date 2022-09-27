package Assignment;
// Encapsulation program Bank and Bankapp
public class Bankapp {
	
	public static void main (String args[]) {
	Bank b=new Bank(); 
	b.setBranchId( 0 );
    System.out.println(b.getBranchId());
    b.setName("abc");
   System.out.println( b.getName());
    b.getAccno();
    
	}

}
