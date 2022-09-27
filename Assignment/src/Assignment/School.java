package Assignment;
// School is a child class inherit from university
public class School extends University{

	@Override
	String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 0011;
	}
	@Override
	void address() {
		// TODO Auto-generated method stub
		System.out.println("Ahmednagar");
	}
	public static void main(String args[]) {
		School sc = new School();// create a school object
		sc.name();
		sc.id();
		sc.address();
		
		
			
	}

	

}
