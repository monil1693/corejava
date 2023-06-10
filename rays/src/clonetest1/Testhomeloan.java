package clonetest1;

public class Testhomeloan {
public static void main(String[] args) {
	
	Bank[]b=new Bank[3];
	b[0]=new Axisbank();
	b[1]=new Hdfcbank();
	b[2]=new Icicibank();
	
	loanenquiry (b);
}

private static void loanenquiry(Bank[] bank) {
	// TODO Auto-generated method stub
	for ( Bank b:bank ) {
		String name =b.getName();
		double rate=b.intrestrate();
		System.out.println(name+"="+rate );
		
	}
}
	
	
	
	
	
}

