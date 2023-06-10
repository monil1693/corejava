package constructor;

import oppscClass.Shape;

public class Square extends Shape {
	private int width;
	private int length;
	public Square (int length, int width) {
		this.length=length;
		this.width=width;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double area () {
		return this.length*this.width;
	}

}
