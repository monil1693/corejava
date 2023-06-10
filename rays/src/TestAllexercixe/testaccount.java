package TestAllexercixe;

import constructor.Circle;
import constructor.Square;
import constructor.Triangle;

public class testaccount extends Shape {

	public static void main(String[] args) {
		account a = new account();
		a.setName("Monil");
		a.deposit(1000);
		a.fundtransfer(200);
		a.setAccounttype("current");
		Rectangle r = new Rectangle(20, 30);
		Circle c = new Circle(20);
		Triangle t = new Triangle(10, 20);
		Square s = new Square(20, 15);
		Tablerows tr = new Tablerows();
		circle1 c1 = new circle1(20);
		square1 s1 = new square1(23, 27);
		triangle2 t1 = new triangle2(20, 10);
		
				
				//System.out.println(tr);
		System.out.println(t1.area()+"=area of triangle1");
		System.out.println(s1.area()+"=area of square1");
		System.out.println(c1.area()+"=area of circle1 ");
		System.out.println(s.area()+"=area of square");
		System.out.println(t.area()+"=area of triangle");
		System.out.println(c.area()+"= area of circle");
		System.out.println(r.area()+ "=area of rectangle");
		//System.out.println(a.getName());
		//System.out.println(a.getBalance());
		//System.out.println(a.getaccounttype());

	}

}
