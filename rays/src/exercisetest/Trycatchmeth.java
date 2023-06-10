package exercisetest;

public class Trycatchmeth {
	public static void main(String[] args) {
		String []arr= {"abc234" , "def564", "ghi987"}; 
		int sum=0;
		for(String str:arr) {
			for(int i =0; i<str.length();i++) {
				System.out.println(str.charAt(i));
				try {
					sum=sum+Integer.parseInt(str.charAt(i)+"");
					System.out.println(sum);
				}catch (Exception e) {
					
				}
			}
		}
		System.out.println("sum="+sum);
	}
}