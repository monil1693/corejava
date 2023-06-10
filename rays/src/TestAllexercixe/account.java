package TestAllexercixe;

import rays.string1;

public class account{
	private String name;
	private String Accounttype;
	private account type;
	private double balance;
	public String getaccounttype(){
		return Accounttype; }
	public void deposit (double d) {
		this.balance =balance+d;}
	public void withdrawl(double w) {
		this.balance=balance-w;
	if (balance>1000) {
		System.err.println("insufficient balance");
		}}
	
	public void setName(String name) {
		this.name=name;}
	public double getBalance() {
		return balance;}
    public void fundtransfer(double f) {
    	balance = balance-f;
    	System.out.println("fund transfer="+f);
    	 
    	
    	
    }
	public String getAccounttype() {
		return Accounttype;
	}
	public void setAccounttype(String accounttype) {
		Accounttype = accounttype;
	}
	public account getType() {
		return type;
	}
	public void setType(account type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	}
	
