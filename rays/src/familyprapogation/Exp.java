package familyprapogation;

public class Exp {
	public static void main(String[] args) {
		dad();
		}
	public static void dad() {
		moom();
	}
	public static void moom() {
		son();
	}
	public static void son() {
		System.out.println("moom ne bacha liya");
		
		try {System.out.println("aaj to bach gaya");
		System.exit(0);
			
		} catch (Exception e) {
			// TODO: handle exception
			}
		}
}