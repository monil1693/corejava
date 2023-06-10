package TestAllexercixe;

public class square1 extends Shape {
	private double length;
	private double width;
	public square1 (double length , double width) {
		this.length=length;
		this.width=width;
		
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double area() {
		return this.length*this.width;
	}
	

}
