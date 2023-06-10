package shapearray;

public class rectangle extends Shape1 {
	private int width;
	private int length;
	
	public rectangle (int length , int width) {
		this.length=length;
		this.width=width;
	}
	
	public int getlength() {
		return length;
	}
	public void setlength (int length) {
		this.length=length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public double area () {
		double r = length*width;
		System.out.println("rectangle ="+r);
		return this.length*this.width;
	}

}
