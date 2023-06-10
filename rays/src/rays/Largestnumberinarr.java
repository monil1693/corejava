package rays;

public class Largestnumberinarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = { 10,20,50,40,30};
		 int a1 =0;
		 int b= a[a1];
		for (int i=0;i<a.length;i++) {
			if (a[i]>b) {
				a1=b;
				b=a[i];
			}
			if(a1<a[i]&&b>a[i]) {
				a1=a[i];
				System.out.println(a1);
			}
			
		}

	}

}
