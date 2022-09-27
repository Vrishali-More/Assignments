package Assignment;
// Multiple inheritance can be achived by using interface 
//Student is a class with two interface Xyz and Abc 
// interface are implements on the Student class
// name and name1 are two interfaces methods can be implemented in one class Student 

public class Student implements Abc,Xyz{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("My name is Xyz");
	}
	
	@Override
	public void name1() {
		// TODO Auto-generated method stub
		System.out.println("My name is Abc");
	}
	public static void main(String a[]) {
		Student std=new Student();
		std.name();
		std.name1();
	}
	
 
}
