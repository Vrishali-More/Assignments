package Assignment;
// School is a child class inherit from university
public class School extends University{

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("New Highschool");
	}

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 11;
	}
	@Override
	int NoofStd() {
		// TODO Auto-generated method stub
		return 555;
	}
	@Override
	void address() {
		// TODO Auto-generated method stub
		System.out.println("Ahmednagar");
	}
	public static void main(String args[]) {
		School sc = new School();// create a school object
		sc.name();
		sc.address();
		System.out.println("School code : \t "+ sc.id());
		System.out.println("School code : \t "+ sc.NoofStd());
		
		
		
			
	}


	
	
	

}
