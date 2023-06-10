package oppscClass;

import java.util.Set;

public class Testaccount {

	public static void main(String[] args) {
		account a = new account();
		a.setName("Monil");
		System.out.println(a.getName());
		a.deposit(1000);
		a.fundtransfer(100);
		//System.out.println(a.getBalance());
		a.withdrawl(1500);
		a.paybill(100);
		a.setAccounttype("current");
		System.out.println(a.getAccounttype());
		System.out.println(a.getBalance());
		a.deposit(4000);
		System.out.println(a.getBalance());
		a.withdrawl(500);
		System.out.println(a.getBalance());
		a.fundtransfer(2000);
		System.out.println(a.getBalance());
	      

	}

}
