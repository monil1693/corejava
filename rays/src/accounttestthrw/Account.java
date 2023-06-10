package accounttestthrw;

public class Account {
		private String name;
		private String accounttype;
		private double balance;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAccounttype() {
			return accounttype;
		}
		public void setAccounttype(String accounttype) {
			this.accounttype = accounttype;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public void deposit(double d) {
			this.balance=balance+d;
		}
		public void withdrawl (double w) throws Insufficientfund {
			this.balance=balance-w;
			if (balance<500) {
				Insufficientfund e = new Insufficientfund();
				throw e;
			}System.out.println("withdrawl ="+w);
		}
public void fundtransfer (double f) throws Insufficientfund{
	this.balance=balance-f;
	if (balance<500) {
		Insufficientfund e = new Insufficientfund();
		throw e ;
	}System.out.println("fund transfer="+f);
	}
public void paybill (double b) throws Insufficientfund{
	this.balance=balance-b;
	if (balance<500) {
		Insufficientfund e = new Insufficientfund();
		throw e;
	}System.out.println("pay bill="+b);
}


}
