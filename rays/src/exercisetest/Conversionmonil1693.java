package exercisetest;

public class Conversionmonil1693 {
public static void main(String[]args) {
	String s = "monil16933";
	int count = 0;
	for (int i = 0; i <s.length(); i++) {
		if(Character.isDigit(s.charAt(i))) {
			count=count+Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		
	}System.out.println(count);
}
}
