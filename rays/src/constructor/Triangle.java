package constructor;

import oppscClass.Shape;

public class Triangle extends Shape
{
	private int base;
	private int height;
	public Triangle (int height , int base) {
		this.height=height;
		this.base=base;
		}
	public int getHeight(int height) {
	      return height;
	}
	public double setHeight(int height) {
		return this.height=height;
	}
	public double getBase(int base) {
		return base;
		
	}
	public double setbase(int base) {
		return this.base=base;
	}
	public double area () {
		return 0.5*this.base*this.height;
		
	}
	

	}


