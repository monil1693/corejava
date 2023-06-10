package exceotionhandling;

public class Try {
public static void main(String[] args) {
	
	int a = 10;
	int b=0;
	
	try {
		int c=a/b;
		System.out.println(c);
		
	} catch (RuntimeException e){
		System.out.println("i am catch");
		// TODO: handle exception
	}
	int d=10;
	int e=2;
	int f=d/e;
	System.out.println(f);
	
	String k = "Monil";
	
	try {System.out.println(k.charAt(3));
		
	} catch (IndexOutOfBoundsException g) {
		System.err.println(g);
		// TODO: handle exception
	}
	
	String l= "rajat";
	
	try { System.out.println(l.charAt(8));
		
	} catch (IndexOutOfBoundsException h ) {
		System.out.println(h);
		// TODO: handle exception
	}
	
	
	
	
}
}
