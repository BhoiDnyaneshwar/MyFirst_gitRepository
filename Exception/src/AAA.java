
import java.io.FileReader;
import java.io.IOException;

public class AAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AAA obj1=new AAA();
		//we can write all exception in one catch block
		
		try(FileReader obj=new FileReader("");) {
		
			//System.out.println(10/0);
			//FileReader obj=new FileReader(" ");
			System.out.println("no line print after exception");
		}
		catch(Exception p) {
			System.out.println("any exception found is handled in one catch block");
			//p.printStackTrace();   //why use..bcz this stament write in every catch block 
			    //so reduce code and this statement write only once time
		}
		/*
		 * finally { obj1=null; System.out.println("executed in any how condition"); }
		 */ 
		
		/*
		 * catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		

	}

	}


