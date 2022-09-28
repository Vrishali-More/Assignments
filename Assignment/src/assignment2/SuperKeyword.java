package assignment2;
// super keyword refer to parent class
class Super{
	String name="abc";
}
class Super1 extends Super{
	String name="Xyz";
	void printname() {
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class SuperKeyword {
	public static void main(String a[]) {
		Super1 s=new Super1();
		s.printname();
	}
	

}
