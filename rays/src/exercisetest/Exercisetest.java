package exercisetest;
public class Exercisetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s={"abc124", "def541","ghi321","jkl643"};
		int sum =0;
		for(int i=0;i<s.length;i++) {
			for (int j =0; j<s[i].length();j++) {
				char c=s[i].charAt(j);
				if(c>='0'&&c<='9') {
				int num = Integer.parseInt(String.valueOf(s[i].charAt(j)));
						System.out.println(num);
						//System.out.println();
						sum=sum+num;
						System.err.println(sum);
						num=0;
			}
		}

	}
System.out.println("sum ="+sum);
}
}