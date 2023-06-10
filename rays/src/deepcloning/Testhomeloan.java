package deepcloning;

public class Testhomeloan {
public static void main(String[] args) {
	Bank[]b= new Bank[3];
	b[0]=new Axisbank();
	b[1]=new Hdfcbank();
	b[2]=new Icicibank();
//}
	loanEnquiry(b);}

private static void loanEnquiry(Bank[] banks) {
	// TODO Auto-generated method stub
	for (Bank b: banks) {
		String name = b.getName();
		double rate=b.intrestrate();
		System.out.println(name+ "="+rate);
	}
}
}

