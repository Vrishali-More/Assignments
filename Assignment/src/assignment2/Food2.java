package assignment2;

public class Food2 extends Food {

	@Override
	void price() {
		// TODO Auto-generated method stub
		System.out.println("40 rupees");
	}

	@Override
	void Foodname() {
		// TODO Auto-generated method stub
		System.out.println("Dosa Samber");
	}
	public static void main(String a[]) {
		Food2 f= new Food2();
		f.price();
		f.Foodname();
		
	}

}
