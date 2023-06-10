package constructor;

import oppscClass.Shape;

public class Rhombus extends Shape {
	private int length;
	private int width;
	public Rhombus (int length ,int width) {
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
	public double area () {
		return this.length*this.width*0.5;
	}

}
