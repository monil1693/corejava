package exception;

public class tryCatch extends Exception{
	public static void main(String[] args) {
		String name = null;
	int []arr= {1,2,3};
	name= "ram";
	int a =10;
	int b= 2;
	int c=a/b;
	
	try {
	System.out.println(name.charAt(4));
	//}
	
	System.out.println(c);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	try {System.out.println(arr[2]);
		
	}
		catch (ArithmeticException e) {
			System.err.println(e);
		}
	try {
	System.out.println(name.charAt(2));
		
	}
		
		catch (NullPointerException e) {
			System.out.println(e);	
	}
	try {
		System.out.println(arr[0]);
	}
	catch(Exception e ) {
		System.out.println(e);
	} 
	
	finally {
		System.out.println("go ahead");
	}int d=10;
	int e=2;
	int f=d/e;
	System.out.println(f);

}
}