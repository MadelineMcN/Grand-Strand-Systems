package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.Contact;
import app.ContactService;

class ContactServiceTest {
	
	ContactService contactService = new ContactService();
	Contact firstContact = new Contact("3333", "Test", "This", "678", "This Street");

	@Test
	void testContactServiceAdd() {
		assertEquals(true, contactService.addContact(firstContact));
	}
	
	@Test
	 void testContactServiceDelete() {
		contactService.addContact(firstContact);
		assertEquals(true, contactService.deleteContact("3333"));
	}
	
	@Test
	void testContactServiceUpdate() {
		contactService.addContact(firstContact);
		assertEquals(true, contactService.updateContactAddress("3333", "321 go"));
		
	}

}
