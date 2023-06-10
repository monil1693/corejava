package rays;

public class Armstrongnumber {

	public static void main(String[] args) {
		int n = 158;
		int s = n;
	int r =0;
	int arm =0;
		while (n>0) {
			r=n%10;
			arm=(r*r*r)+arm;
			n=n/10;}
			if (arm==s) {
				System.out.println(s+"=armstrong no.");
				}else {
					System.out.println(s+"=not armstrong no.");
				}
			
		}
	}


