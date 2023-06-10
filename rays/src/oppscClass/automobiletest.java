package oppscClass;

public class automobiletest {

	public static void main(String[] args) {
		Automobile a = new Automobile();
		a.setColour("black");
		a.setMake("honda");
		a.setSpeed(99);
		a.Break(30);
		a.acceleration(40);
		System.out.println(a.getSpeed());
		int i= a.getSpeed();
		int j=i+30;
		int k=j+30;
		int l=k+30;
		
		if (gear()==1) {
			System.out.println("speed in 1st gear"+i+"km/hr" );
			
		}
		else if (gear()==2) {
			System.out.println("speed in 2nd gear"+j+"km/hr");
			
		}
		else if (gear()==3) {
			System.out.println("speed in 3rd gear"+k+"km/hr");
			
		}
		else if (gear()==4) {
			System.out.println("speed in 4th gear"+l+"km/hr");
	
		}
		else {
			System.out.println("speed is 0 km/hr");
		}
		
		System.out.println(a.getColour());
		System.out.println(a.getMake());
		System.out.println(a.getSpeed());
	}

	private static int gear() {
		// TODO Auto-generated method stub
		return 2;
	}

}

