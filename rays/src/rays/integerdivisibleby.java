package rays;

public class integerdivisibleby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int sum =0,count=0;
 for(int i=101;i<200;i++) {
	if(i%7==0) {
		sum=sum + i;
		count++;
	}
 }System.out.println(sum);
 System.out.println(count);
	}

}
