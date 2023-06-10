package deepcloning1;

public class Account1 implements Cloneable{
	private int balance;
	public Account1 (int balance) {
		this.balance=balance;
	}
public int getBalance() {
	return balance;
}
public void setBalance(int i) {
	this.balance=balance;
}

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
	
}
