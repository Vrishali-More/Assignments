package Assignment;
//Collage is a child class inherit from University
public class Collage extends University {

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("New arts commerce And Science Collage");
	}

	

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 77;
	}

	@Override
	int NoofStd() {
		// TODO Auto-generated method stub
		return 888;
	}


	@Override
	void address() {
		// TODO Auto-generated method stub
		System.out.println("Pune");
	}
	public static void main(String args[]) {
		Collage col = new Collage();// create a school object
		col.name();
		col.address();
	     System.out.println("COllage code: \t"+ col.id());
	     System.out.println("COllage code: \t"+ col.NoofStd());
		
		
		
			
	}



		
}



