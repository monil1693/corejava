package shapearray;

public class Shape1 {
private String colour;
private int borderwidth;
public static final double PI=3.14;
public Shape1 () {
	}
public Shape1 (String colour , int borderwidth) {
	this.colour=colour;
	this.borderwidth =borderwidth;
}
public String getcolour () {
	return colour;
}
public void setcolour (String colour) {
	this.colour=colour;
}
public int getborderwidth() {
	return borderwidth;
}
	
	public void setborderwidth(int borderwidth) {
		this.borderwidth=borderwidth;
}
	public double area () {
		return 0;
	}
}
