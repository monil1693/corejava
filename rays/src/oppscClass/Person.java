package oppscClass;

import java.util.Date;

public class Person {
private String name;
private String date;
private String address;
public static final int AVG_AGE=18;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public static int getAvgAge() {
	return AVG_AGE;
}
}


