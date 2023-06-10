package TestAllexercixe;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n,r,c,arm=0;
		   n=154;
		   c=n;
		   while(n>0) {
			   r=n%10;
			   arm=(r*r*r)+arm;
			   n=n/10;}
	
			   if (c==arm) {
				   System.out.println(c+"=armstrong number");
			   }else {
				   System.out.println(c+"=not armstorng number");
			   }
}
}
