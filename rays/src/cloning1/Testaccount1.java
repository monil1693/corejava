package cloning1;

public class Testaccount1 {
public static void main(String[] args) throws Exception{
	Account1 a1= new Account1(20);
	Account1 a2= (Account1)a1.clone();
	a2.setBalance(100);
	System.out.println(a1.getBalance());
	System.out.println(a2.getBalance());
}
}
