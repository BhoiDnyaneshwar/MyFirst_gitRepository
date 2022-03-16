import java.io.FileNotFoundException;
import java.io.FileReader;

public class multipecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
m3();
	}
	
	public static void m3() {
		
		  try {
			  System.out.println(10/0);
			  //FileReader ss=new FileReader("");
		  } 
			/*
			 * catch(FileNotFoundException g) { System.out.println("nullll"); }
			 */
		  catch(Exception z) {
		  //z.printStackTrace();
		  System.out.println("graceful termination");
		  }
		 
		
		System.out.println("i am from m3");
	}
}
