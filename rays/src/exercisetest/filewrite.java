package exercisetest;

import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

	public static void main(String[] args) throws Exception {
		FileWriter f = new FileWriter("C:\\Users\\acer\\OneDrive\\Desktop\\io stream\\babu.txt",true);
        f.write("mele babu ne thana thaya");
        f.close();
	}

}
