package rays;

public class secondlargest {

	public static void main(String[] args) {
		int [] s= { 1,2,33, 66 ,666, 77 ,88, 999};
		int a = 0;
		int b = s[0];
		for(int i =0; i<s.length;i++) {
			if (s[i]>b) {
				a=b;
				b=s[i];
			}
			if(a<s[i] && s[i]<b) {
			a=s[i];
		}

			
       
	}System.out.println(a);
}

}
