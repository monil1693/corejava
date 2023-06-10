package rays;

public class Avgodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int
		oddsum=0,evensum=0,evencount=0,oddcount=0;
		for(int i =0;i<=9;i++) {
			if(arr[i]%2==0) {
				evensum=evensum+arr[i];
				evencount++;
				
			}else {
				oddsum=oddsum+arr[i];
						oddcount++;
			}
		}
		double avgodd=oddsum/oddcount;
		double avgeven=evensum/evencount;
		System.out.println("average of even no."+ avgeven);
		System.out.println("average of odd no."+ avgodd);

	}
}

