package contact.dao;

import java.util.List;

import contact.entity.Contact;

public interface ContactDAO {

    public Long addContact(Contact contact);

    public void updateContact(Contact contact);

    public void deleteContact(Long contactId);

    public Contact getContact(Long contactId);

    public List<Contact> findContact();
}
