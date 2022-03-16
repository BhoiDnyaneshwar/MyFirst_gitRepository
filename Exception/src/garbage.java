
public class garbage {
 String var;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("jherhfhf");
		garbage obj=new garbage();
		obj=null;
		garbage obj1=new garbage();
		garbage obj2=new garbage();
obj2=obj1;

garbage obj3=new garbage();
garbage obj4=new garbage();
garbage obj5=new garbage();
obj3=obj4;
System.out.println("obj4 is empty");
obj5=obj3;
System.out.println("obj3 is empty");


System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("executed something");
	}
}
