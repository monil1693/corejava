package deepcloning1;

public class Customer implements Cloneable {
	String name=null;
	public account Account = null;
	
	
	public Customer (String name) {
		this.name=name;
		Account = new account(10);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//Object Customer;
		Customer c = (Customer)super.clone();
		c.Account= (account)Account.clone();
		return c;
	}

}
