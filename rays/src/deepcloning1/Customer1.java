package deepcloning1;

public class Customer1 implements Cloneable {
	public String name = null;
	public Account1 account=null;
	
public Customer1 (String name) {
	this.name=name;
	account =new Account1(20);
	
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	Customer1 c = (Customer1)super.clone();
	c.account = (Account1)account.clone();
	return c;
}




}
