package TestAllexercixe;

public class circle1 extends Shape {
	private int radius;
	public circle1 (int radius) {
		this.radius=radius;
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area () {
		return 3.14*this.radius*this.radius; 
	
	}

}
