package javaiosttream;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class externalizableemployee implements Externalizable {

	public String id;
	public String firstname;
	public String lastname;
	public int salary;
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		id = (String)in.readObject();
		firstname = (String)in.readObject();
		lastname = (String)in.readObject();
		salary = (int)in.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(id);
		out.writeObject(firstname);
		out.writeObject(lastname);
		out.writeObject(salary);
		
		
	}

	}


