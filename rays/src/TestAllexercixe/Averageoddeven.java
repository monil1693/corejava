package TestAllexercixe;

public class Averageoddeven {

	public static void main(String[] args) {
		int evensum=0,evencount=0,oddsum=0,oddcount=0;
		int arr [] = {1,2,3,4,5,6,7,8,9,10}; 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evensum=evensum+arr[i];
				evencount++;
			}else {
				oddsum=oddsum+arr[i];
				oddcount++;
				
			}
		}double avgeven=evensum/evencount;
		double avgodd=oddsum/oddcount;
		System.out.println(avgeven +"=average of even no. ");
		System.out.println(avgodd);
	}
}
