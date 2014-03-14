package logika;

import java.util.List;

import model.Contact;

public interface PhoneBookInterface {
	public void add(Contact c);
	public void delete(Contact c);
	public Contact getContact(int id);
	public List<Contact> getAllContacts();
}
