package model;

import java.util.List;

public abstract class Contact {
	public int id;
	public int PhoneNumber;
	List<String> PhoneNumbers;
	public abstract String getContactName();
	

}
