package collectiontest;

public class Emp implements Comparable<Emp> {
int id;
String name;
String address;

 Emp(int id , String name , String address) {
	this.id=id;
	this.address=address;
	this.name=name;
}


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
}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+name+address;
	}


@Override
public int compareTo(Emp o) {
	// TODO Auto-generated method stub
	return this.id-o.id;
}

}
