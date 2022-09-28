package assignment2;

public class Exception {
	public static void main(String a[]) {
     int n=10;
	 int b=0;
	 try{
		
		System.out.println("Division"+n/b);
		
	}
	catch(ArithmeticException e){
		System.out.println("Does not divide by zero");
		e.printStackTrace();
	}
	 finally {
		 System.out.println("you can divide any number except zero");
	 }

}
}