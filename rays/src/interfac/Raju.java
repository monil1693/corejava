package interfac;

class Raju implements Client {
	String name;double sal;

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("input username");
		System.out.println("enter salary");
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println(name +" "+sal);
		
	}
	

}
