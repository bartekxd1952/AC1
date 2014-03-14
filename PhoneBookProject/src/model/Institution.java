package model;

public class Institution extends Contact {
	private String InsitutionName;

	@Override
	public String getContactName() {
		return InsitutionName;
	}

}
