package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.Contact;

class ContactTest {
	
	Contact contact = new Contact("10", "testing", "wowtesting", "9876543210", "30307");

	@Test
	void testAddress() {
		assertTrue(contact.getAddress().equals("30307"));
	}
		
	
	@Test
	void testContact() {
	
		assertTrue(contact.getContact().equals("10"));
		
	}
	
	@Test
	void testFirstName() {
		assertTrue(contact.getFirstName().equals("testing"));
		
		
	}
	
	@Test
	void testLastName() {
		
		assertTrue(contact.getLastName().equals("wowtesting"));
		
	
	}
	
	@Test
	void testPhoneNumber() {
	
		assertTrue(contact.getPhoneNumber().equals("9876543210"));
		
	}
	
	
	
	
}
