package objprint;

public class Testp {
	private int id;
	private String name;
	private String address;
	
	public Testp (int id , String name, String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}
	public String getAddress() {
		return address;
		}
	public void setAddress() {
		this.address=address;
	}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  id + name + address;
	}
}
