package shapearray;

public class Testshape {

	public static void main(String[] args) {
		 Shape1 [] s1 = new Shape1[3];
		 s1[0]= new rectangle(10, 5);
		 s1[1]=new Circle(4);
		 s1[2] = new Triangle(10, 10);
		 
		 double totalarea = 0;
		 
		 for (int i =0 ; i<s1.length; i++) {
			 totalarea=totalarea + s1[i].area();
		 }
		 System.out.println("total area="+totalarea);
		 
	}
}
