package rays;

public class palindrometest {

	public static void main(String[] args) {
	int r=0;
	int s=0;
	int n = 121;
	int c=n;
	while( n>0) {
		r=n%10;
		s=s*10+r;
		n=n/10;}
	if (c==s) {
		System.out.println(c+"=palindrome no.");
		
	}else {
		System.out.println(c+"=not palindrome no");
	}
	
	}
}
