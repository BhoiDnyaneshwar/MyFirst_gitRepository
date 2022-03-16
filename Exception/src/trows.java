
public class trows extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1("dnyane", "");
	}

	
	public static void m1(String username,String password)  {
		
		if(password.isEmpty()) {
			System.out.println("to enter correct crendetial");
			throw new NullPointerException();
			
		}else {
			System.out.println("succesfully login");
		}
		
		
		
	
	}}
