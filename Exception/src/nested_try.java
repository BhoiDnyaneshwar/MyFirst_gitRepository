import java.io.FileNotFoundException;
import java.io.FileReader;

public class nested_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			//System.out.println(10/0);
			System.out.println("ghsjajaja");
			try {
				FileReader obj=new FileReader("");
			}catch(FileNotFoundException y) {
				System.out.println("filenotfound exc is handled");
			}
			System.out.println(10/0);
			System.out.println("in main try");
		}
catch(ArithmeticException p) {
	System.out.println("arithmetic exc handled");
}
		System.out.println("out of country");
		
	}

}
