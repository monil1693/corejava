package exercisetest;

public class Armstrongtest {

	public static void main(String[] args) {
	int n = 153;
	int s=n;
	int arm=0;
	int r;
	while(n>0) {
		r=n%10;
		arm=(r*r*r)+arm;
		n=n/10;
	}
	if (arm==s) {System.out.println(s+"= armstrong no.");
		
	}else {
		
	System.out.println(s+"=not armstrong no.");
	}
	}
}