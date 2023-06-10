package deepcloning1;

public class Testclone1 {
public static void main(String[] args) throws Exception {
	 
	Customer c1 = new Customer("monil");
	Customer c2 = (Customer)c1.clone();
	c1.name = "ravi";
	c1.Account.setBalance(100);
	c2.Account.setBalance(50);
	
	System.out.println(c1.name);
	System.out.println(c1.Account.getBalance());
	System.out.println(c2.name);
	System.out.println(c2.Account.getBalance());
	
}
}
