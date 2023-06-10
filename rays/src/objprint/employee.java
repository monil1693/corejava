package objprint;

import abs2.person;

public class employee {
	private int id;
	private String name;
	private String address;
	
	public employee (int id , String name, String address) {
		this.id=id;
		this.name=name;
		this.address=address;
		}

	//public Person(int id2, String name2, String address2) {
		// TODO Auto-generated constructor stub
	//}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return id+name+address;
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	String str = id+name+address;
	return str.hashCode();
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(!(obj instanceof employee)) {
	return false;
}
	
	employee e = (employee)obj;
	boolean b = this.id==e.id && this.name==e.name && this.address==e.address;
	return b;
}

}
