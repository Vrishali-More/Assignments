package Assignment;
//Collage is a child class inherit from University
public class Collage extends University {

	@Override
	String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 0077;
	}

	@Override
	void address() {
		// TODO Auto-generated method stub
		System.out.println("Pune");
	}
	public static void main(String args[]) {
		Collage col = new Collage();// create a school object
		col.name();
		col.id();
		col.address();
		
		
			
	}

}



