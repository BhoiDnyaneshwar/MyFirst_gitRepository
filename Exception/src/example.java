import java.io.FileNotFoundException;
import java.io.FileReader;

public class example{

	public static void main(String[] args) throws FileNotFoundException  {
		example obj=new example();
		System.out.println("i am from main");
		obj.m1();

		
		
		
	}
	
	public  void m1() throws FileNotFoundException {
		m2();
		System.out.println("i am from m1");
		
		
	}
	
public void m2() throws FileNotFoundException {
	
	System.out.println("i am from m2");
	m3();
	
	FileReader ss=new FileReader("");
	
	
	}

public void m3() {
	
	  try { System.out.println(10/0);
	  } 
	  catch(NullPointerException g) {
		  System.out.println("nullll");
	  }
	  catch(ArithmeticException e) {
	  e.printStackTrace();
	  System.out.println("graceful termination");
	  }
	 
	
	System.out.println("i am from m3");
}

}

class B extends example{
	
	
	public static void main(String[] args) {
		B z=new B();
		
		  try {
			  System.out.println("gaurav");
			  z.m1();
			  System.out.println("try me hai me");
		  }
		  catch (FileNotFoundException e) { 
			  // TODO Auto-generated
		  System.out.println("handled in child class"); 
		  }
		 
		
	}
	
	/*
	 * public void m1() {
	 * 
	 * }
	 */
	
}
