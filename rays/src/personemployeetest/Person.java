package personemployeetest;

import rays.object;

public class Person {
private int id;
private String name;
private String address;

public Person() {
	System.out.println("zero param constructor");
}

public Person(int id) {
	System.out.println("1 param constructor");
}
public Person(int id ,String name) {
	System.out.println("2 param constructor");
}
public Person(int id , String name, String address) {
	this.id=id;
	this.name=name;
	this.address=address;
	//System.out.println("3 param constructor");
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public String getName() {
	return name;
}
public void setName( String name) {
	this.name=name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address=address;
}@Override
	public String toString() {
		 //  TODO Auto-generated method stub
		return id+name+address;
	}

@Override
public int hashCode() {
  String str = id+name+address;
  return str.hashCode();
}

@Override
public boolean equals(Object obj) {
	if(!(obj instanceof Person )) {
		return false;
	}
		Person p = (Person)obj;
			boolean b =this.id==p.id && this.name==p.name && this.address==p.address;
			return b;
	// TODO Auto-generated method stub
	//return super.equals(obj);
}


}
