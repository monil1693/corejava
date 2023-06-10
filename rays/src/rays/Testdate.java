package rays;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdate {

	public static void main(String[] args) throws ParseException {
	Date today = new Date();
	System.out.println(today);
	SimpleDateFormat sdf = new SimpleDateFormat();
	String s = sdf.format(today);
	System.out.println(s);
	 String src = "18/11/2002";
	 SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	 Date d = sdf1.parse(src);
	 System.out.println(d);
	 
	
	}

}
