package TestAllexercixe;

public class triangle2 extends Shape{
	private double length;
	private double base;
	public triangle2 (double length , double base) {
		this.base=base;
		this.length=length;
		
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double area () {
		return 0.5*this.base*this.length;
	}

}
