package cloning1;

public class person1 {
	private int id;
	private String name;
	private String address;
	
	public person1() {
		System.out.println("zero parameter constructor");	
	}
	
	public person1(int id) {
		System.out.println("1 parameter constructor");
	}
	public person1(int id , String name) {
		System.out.println("2 parameter constructor");
	}
	public person1 (int id , String name , String address) {
		this.id=id;
		this.name=name;
		this.address=address;
		
		//System.out.println("3 parameter constructor");
	}

	
	public int getId () {
		return id;
	}
	
	public void setId (int id) {
	this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	}
