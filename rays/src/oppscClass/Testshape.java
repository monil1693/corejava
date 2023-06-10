package oppscClass;

import constructor.Circle;
import constructor.Rectangle;
import constructor.Rhombus;
import constructor.Square;
import constructor.Trapezoid;
import constructor.Triangle;

public class Testshape {

	public static void main(String[] args) {
		Shape s = new Shape();
		Rectangle r = new Rectangle(9, 7);
		Circle c = new Circle(10);
		Triangle t = new Triangle(9, 8);
		Square q = new Square(10, 20);
		Trapezoid t1 = new Trapezoid(10, 20, 5);
		Rhombus r1 = new Rhombus(20, 30);
		
		System.out.println(r1.area());
		System.out.println(t1.area());
		System.out.println(q.area());
		System.out.println(r.area()+"=area of rectangle ");
		System.out.println(c.area()+ "= area of circle");
		System.out.println(t.area()+ "=area of triangle ");
		
		
		
	

	}

}
