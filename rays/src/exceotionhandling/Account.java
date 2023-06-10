package exceotionhandling;

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
	public void withdrawl (double w) {
		this.balance=balance-w;
	
		}
	}


