package oppscClass;

public class Shape {	
private String colour;
private int borderwidth;
 
public Shape() {
}
public Shape(String color, int borderwidth) {
	this.borderwidth=borderwidth;
	this.colour=color;
}

public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getBorderwidth() {
	return borderwidth;
}
public void setBorderwidth(int borderwidth) {
	this.borderwidth = borderwidth;
}


}
