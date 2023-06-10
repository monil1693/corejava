package rays;

public class Stringreverse {

	public static void main(String[] args) {
		String name = "java core";
		int l=name.length();
		String rev="";
		String rev21="";
		for(int i =3;i>=0;i--){
			rev=rev+name.charAt(i);
		}System.out.print(rev+ " ");
		
	for(int j =8;j>=4;j--){
		rev21 = rev21+name.charAt(j);
 }System.out.print(rev21);
	}
}
