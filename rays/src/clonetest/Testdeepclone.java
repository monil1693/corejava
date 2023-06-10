package clonetest;

public class Testdeepclone {
public static void main(String[] args) throws Exception {
	Customer c1=new Customer("monil");
	Customer c3=(Customer)c1.clone();
	Customer c2= (Customer)c1.clone();
	Customer c4=(Customer)c1.clone();
	c4.name="ram";
	c3.name="ravi";
	c2.name= "rohit";
	c4.account.setBalance(500);
	c2.account.setBalance(20);
	c3.account.setBalance(20);
	System.out.println(c1.name);
	System.out.println(c1.account.getBalance());
	
	System.out.println(c2.name);
	System.out.println(c2.account.getBalance());
	
	System.out.println(c3.name);
	System.out.println(c3.account.getBalance());
    System.out.println(c4.name);
    System.out.println(c4.account.getBalance());

}

}
