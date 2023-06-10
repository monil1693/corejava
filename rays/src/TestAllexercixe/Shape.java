package TestAllexercixe;
public class Shape {
private String colour;
private int borderwidth;
public static final double PI=3.14;

public Shape () { 
	
}
public Shape (String colour,int borderwidth ) {
	this.borderwidth=borderwidth;
	this.colour=colour;
}
public String getColour() {
return colour;
}
public void setColour(String colour) {
	this.colour=colour;
}
public int borderwidth() {
	return borderwidth;
}
public void setborderwidth(int boderwidth) {
	this.borderwidth=boderwidth;
}
}
