package clonetest;

public class Testaccount {
public static void main(String[] args) throws Exception {
	
	Account a1= new Account(20);
	Account a2= (Account)a1.clone();
	a2.setBalance(100);
	
	System.out.println(a1.getBalance());
	System.out.println(a2.getBalance());
	
}
}
