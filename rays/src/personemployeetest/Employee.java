package personemployeetest;

public class Employee extends Person {
private String department;

public Employee(int id, String name, String address,String department ) {
	super(id , name , address);
	this.department=department;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department=department;
}@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
