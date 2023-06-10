package rays;

public class Largestno {
public static void main(String[] args) {
	
	int a[]= {10,1,20,33,55,43,69};
	 int max=a[0];
	 for(int i=1;i<a.length;i++) {
		 if(a[i]>=max)
		 max=a[i];
	 }
	System.out.println(max);
}
}
