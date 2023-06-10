package constructor;

import oppscClass.Shape;

public class Trapezoid extends Shape {
private int length;
private int width;
private int height;
public Trapezoid (int length, int width , int height) {
	this.height=height;
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
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public double area () {
	return 0.5*this.height*(this.length+this.width);
}
}
