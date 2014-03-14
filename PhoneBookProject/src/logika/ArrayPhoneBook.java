package logika;

import java.util.List;

import model.Contact;

public class ArrayPhoneBook implements PhoneBookInterface {

	Contact tab[];
	byte i;

	
	public void add(Contact c) {
		if (i < 10) {
			tab[i] = c;
			i++;
		} else {
			System.out
					.println("Mamy ju¿ ponad 10 numerów, usun i spróbuj ponownie ! ");
		}

	}

	@Override
	public void delete(Contact c) {
		c.id = 3; 

	}

	@Override
	public Contact getContact(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

}
