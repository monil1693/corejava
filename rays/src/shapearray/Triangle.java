package shapearray;

public class Triangle extends Shape1 {
private int hieght;
private int base;
	
	public Triangle (int hieght , int base ) {
		this.base=base;
		this.hieght=hieght;
	}

	public int getHieght() {
		return hieght;
	}

	public void setHieght(int hieght) {
		this.hieght = hieght;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	public double area () {
		double t = (0.5*base*hieght);
		System.out.println("triangle = "+ t);
		return 0.5*base*hieght;
	}
}
