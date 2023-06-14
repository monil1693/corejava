package exercisetest;

public class Descendingtest {
public static void main(String[]args) {
	
	 int []a= {11,22,10,9,99,78,65,34,1,2,7,3};
	 int t =0;
	 
	 for(int i =0;i<a.length;i++) {
		 for(int j=i+1;j<a.length;j++) {
			 
			 if (a[i]<a[j]) {
				 t=a[i];
				 a[i]=a[j];
				 a[j]=t;
			 }
		 }System.out.println(a[i]);
	 }
	
}
}
