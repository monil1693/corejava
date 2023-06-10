package familyprapogation;

public class Familyprapoga {
public static void main(String[] args) {
	dad();
}
public static void dad() {
	try {mom();
		
	} catch (Exception e) {
		System.out.println("caught by dad");
		// TODO: handle exception
	}
}
public static void mom() {
	son();
}
public static void son() {
	Exception e=new Exception("i made a mistake");
	 System.out.println(e);;
}
}
