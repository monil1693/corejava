package clonetest;

public class Account implements Cloneable {
	private int balance;
 public Account (int balance) {
	 this.balance=balance;
 }
	public int getBalance () {
		return balance;
	}
	public void setBalance( int balance ) {
		this.balance=balance;
	}
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
    
}