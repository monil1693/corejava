package TestAllexercixe;

public class Palindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r =0;
		int s = 0;
		int n = 14341;
		int c=n;
		while(n>0) {
			r=n%10;
			s=s*10+r;
			n=n/10;}
			if (s==c) { 
				System.out.println(c+"=palindrome number");
			}else {
				System.out.println(c+"=not palindrome number");
			}
		}

	}


