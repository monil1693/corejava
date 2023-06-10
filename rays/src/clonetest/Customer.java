package clonetest;

public class Customer implements Cloneable {
String name = null;
public Account account = null;

public Customer (String name) {
	this.name=name;
	//name = n;
	account =new Account(100);
	
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer c = (Customer)super.clone();
	    c.account=(Account) account.clone();
		return c;
}

}
