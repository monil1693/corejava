package cloning1;

public class employee1 extends person1 {
	private String department;
	
	public employee1(int id , String name , String address , String department) {
	super(id,name,address);
		this.department=department;
}

	public String getdepartment() {
		return department;
	}
	
	public void setdepartment(String department) {
		this.department=department;
	}
	
	
}
