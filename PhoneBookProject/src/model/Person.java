package model;

public class Person extends Contact{
	private String name, surname;

	@Override
	public String getContactName() {
		return name + " " + surname;
	}
	
	
	
}
