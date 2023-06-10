package TestAllexercixe;

public class Primenumertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9,i,count=0;
		for(i=1;i<=n;i++) {
		if( n%i==0) {
			count++;}
		}
			if(count==2){
			System.out.println(n+"=prime no.");
		}else {
			System.out.println(n+"=not prime no.");
			
			
		}
			
		}

	}



