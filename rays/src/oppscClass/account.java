package oppscClass;

public class account {

private	String name;
private	double balance;
private String Accounttype;
private account type;

public String getAccounttype() {
	return Accounttype;
}
public void setAccounttype(String accounttype) {
	Accounttype = accounttype;
}
public String getName() {
	return name;
}public void deposit (double d) {
	this.balance=balance+d;
}
public void withdrawl(double w) {
	this.balance= balance-w;
	
	try {
	if(balance<1000);
	System.err.println("insufficient balance you can't make payment");
	} 
	catch (Exception e) {
		//System.out.println("insufficient balance");
		// TODO: handle exception
	}
	//finally {
		//System.out.println("end here");
	//}
	//this.balance= balance-w;
	//if(balance<1000) {
		//System.err.println("insufficient balance");
	//}
	
	
	
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public account getType() {
	return type;
}
public void setType(account type) {
	this.type = type;
}
public void fundtransfer(double f)
{
	balance=balance-f;
	System.out.println("fund transfer="+f);
	}
public void paybill (double p) {
	balance=balance-p;
	System.out.println("bill payement"+p);
}
	

	}