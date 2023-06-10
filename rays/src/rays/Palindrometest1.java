package rays;

public class Palindrometest1 {

	public static void main(String[] args) {
		int n =121;
		int c=n;
		int r=0;
		int sum=0;//10[12] 
		while (n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}if (c==sum) {
			System.out.println(c+"=palindrome no.");
		}else {
			System.out.println(c+"=not palindrome no.");
			
		}
			
		}

	}


