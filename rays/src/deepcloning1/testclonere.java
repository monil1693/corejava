package deepcloning1;

public class testclonere {
	public static void main(String[] args) throws Exception {
		
		Customer1 c1 = new Customer1("monil");
		Customer1 c2 = (Customer1)c1.clone();
		
		c1.account.setBalance(100);
		c2.name="raju";
		c2.account.setBalance(90);
		
		System.out.println(c1.name);
		System.out.println(c1.account.getBalance());
		System.out.println(c2.name);
		System.out.println(c2.account.getBalance());
		
	}

}
