package incoraysbundle;

import java.util.ResourceBundle;

public class TestBundle {

	public static void main(String[] args) {
		ResourceBundle rb =ResourceBundle.getBundle("incoraysbundle.JdbcConnection");
		ResourceBundle rb1 =ResourceBundle.getBundle("incoraysbundle.hi");
		 for (int i = 1; i <=1; i++) {
			
		
		
		System.out.println(rb1.getString("greetings")+i);
		 }
	}

}
