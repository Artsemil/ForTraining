package contact.business;

import java.util.List;

import contact.dao.ContactDAO;
import contact.dao.ContactDAOFactory;
import contact.entity.Contact;

public class ContactManager {

    private ContactDAO dao;

    public ContactManager() {
        dao = ContactDAOFactory.getContactDAO();
    }

    public Long addContact(Contact contact) {
        return dao.addContact(contact);
    }

    public Contact getContact(Long contactId) {
        return dao.getContact(contactId);
    }

    public void updateContact(Contact contact) {
        dao.updateContact(contact);
    }

    public void deleteContact(Long contactId) {
        dao.deleteContact(contactId);
    }

    public List<Contact> findContacts() {
        return dao.findContact();
    }
}
