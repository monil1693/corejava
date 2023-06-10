package TestAllexercixe;

public class Rectangle extends Shape {
private int length;
private int width;
public Rectangle (int length, int width) {
	this.length=length;
	this.width=width;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public double area() {
	return 0.5*this.length*this.width;
}

}
