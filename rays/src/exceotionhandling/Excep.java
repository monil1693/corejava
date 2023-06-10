package exceotionhandling;

public class Excep extends Exception{
	public static void main(String[] args) {
		
	String name ="abc";
	System.out.println(name);
	
	try {
	int a =10;
	int b = 0;
	
	int c=a/b;
	System.out.println(c);
	} 
	
	catch ( Exception e) {
		System.out.println(e);
		// TODO: handle exception
}
}
}
