package abs2;

public class Employee extends person {
private String  department;
public Employee () {
	System.out.println("zero param const");
}
public Employee (int id , String name , String address , String department) {
	super(id , name , address);
	this.department=department;
	
	//System.out.println("three param const");
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
}
