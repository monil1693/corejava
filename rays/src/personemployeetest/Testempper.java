package personemployeetest;

public class Testempper {
public static void main(String[] args) {
	Employee e = new Employee(10,"Monil","indore","IT");
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getAddress());
	System.out.println(e.getDepartment());
}
}
