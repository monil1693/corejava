package exception;

import java.text.ParseException;

public class Trycatch2 {
	public static void main(String[] args) {
		try {int a=10/2;
		int b[]= {1,2,3};
		String c = null;
		
		
		System.out.println(b[1]);
		System.out.println(a);
		int d=Integer.parseInt(c);
			System.out.println(c.toUpperCase());
			
		}catch(NullPointerException e) {
			System.out.println("i am child excep");
			
		} catch ( ArithmeticException e) {
			// TODO: handle exception
			System.out.println("this excption");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("all exception ka baap");
		}
	}

}
