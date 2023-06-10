package abs2;

public class person {
	private int id;
	private String name ;
	private String address;
	//public String getdepartment;
	public person () {
		System.out.println("zero param const");
	}
	public person (int id) {
		//this();
		System.out.println("1st param const");
	}
	public person (int id , String name) {
		//this(id);
		System.out.println("2nd param const");
	}
	public person (int id , String name, String address) {
		this.id=id;
		this.address=address;
		this.name=name;
		System.out.println("3rd param const");
   }
	//public String getGetdepartment() {
	//	return getdepartment;
	//}
	//public void setGetdepartment(String getdepartment) {
		//this.getdepartment = getdepartment;
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
	
   }