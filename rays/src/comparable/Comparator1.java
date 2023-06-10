package comparable;

import java.util.Comparator;

public class Comparator1 implements Comparator<employee> {
	int id;
	String address;
	String name;
	
	public Comparator1(int id , String name , String address){
		this.id=id;
		this.name=name;
		this.address=address;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+name+address;
	}

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
	}
class OrderByName implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}