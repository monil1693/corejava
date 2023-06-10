package throwexp;

public class Testthrw {
private int a;
private int b;

public Testthrw (int a, int b) {
	//this.a=a;
	//this.b=b;

	if(b==0) {
		throw new ArithmeticException("!!/by zero");
	}else {
		int c=a/b;
		System.out.println(c);
		}
	}
}
