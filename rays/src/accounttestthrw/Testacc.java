package accounttestthrw;

public class Testacc {
public static void main(String[] args) {
	Account a = new Account();
	a.setBalance(5000);
	a.setAccounttype("current");
	a.setName("arun kamina");
	
	a.deposit(500);
	try {
		a.withdrawl(1501);
	}catch(Exception e) {
		System.out.println(e.getMessage());
		}
	try {a.fundtransfer(1000);
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	try {
		a.paybill(2500);
	} catch (Exception e) {
		
	}
}
}
