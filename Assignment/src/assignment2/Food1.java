package assignment2;

public class Food1 extends Food {

	@Override
	void price() {
		// TODO Auto-generated method stub
		System.out.println("50 rupees");
	}

	@Override
	void Foodname() {
		// TODO Auto-generated method stub
		System.out.println("Poha");
	}
	public static void main(String a[]) {
		Food1 f= new Food1();
		f.price();
		f.Foodname();
		
	}

}
