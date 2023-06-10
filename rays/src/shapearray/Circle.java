package shapearray;

public class Circle extends Shape1 {
	private double radius;
	public static final double PI=3.14;
	public Circle( double radius) {
		this.radius=radius;
		
	}
	//public Circle(double radius) {
		// TODO Auto-generated constructor stub
	//}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static double getPi() {
		return PI;
	}

	public double area () {
		double z = 3.14*radius*radius;
		System.out.println("circle ="+z);
		return 3.14*this.radius*this.radius;
		//return z;
	}
}
