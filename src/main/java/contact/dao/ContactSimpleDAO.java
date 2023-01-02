package contact.dao;

import java.util.ArrayList;
import java.util.List;

import contact.entity.Contact;

public class ContactSimpleDAO implements ContactDAO {

    private final List<Contact> contacts = new ArrayList<Contact>();

    public ContactSimpleDAO() {
        addContact(new Contact("Андрей", "Соколов", "+7-911-890-7766", "sokolov@yandex.ru"));
        addContact(new Contact("Сергей", "Иванов", "+7-911-890-7755", "ivanov@google.com"));
        addContact(new Contact("Татьяна", "Семенова", "+7-911-890-1164", "semenova@mail.ru"));
        addContact(new Contact("Татьяна", "Семенова", "+7-911-890-1164", "semenova@mail.ru"));
        addContact(new Contact("Татьяна", "Семенова", "+7-911-890-1164", "semenova@mail.ru"));
    }

    @Override
    public Long addContact(Contact contact) {
        Long contactId = generateContactId();
        contact.setContactId(contactId);
        contacts.add(contact);
        return contactId;
    }

    @Override
    public void updateContact(Contact contact) {
        Contact oldContact = getContact(contact.getContactId());
        if (oldContact != null) {
            oldContact.setFirstName(contact.getFirstName());
            oldContact.setLastName(contact.getLastName());
            oldContact.setPhone(contact.getPhone());
            oldContact.setEmail(contact.getEmail());
        }
    }

    @Override
    public List<Contact> findContact() {
        return contacts;
    }

    @Override
    public void deleteContact(Long contactId) {
        Contact contact = contacts.stream().filter(con -> con.getContactId().equals(contactId)).findFirst().get();
        contacts.remove(contact);
    }

    @Override
    public Contact getContact(Long contactId) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                return contact;
            }
        }
        return null;
    }

    private Long generateContactId() {
        Long contactId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        while (getContact(contactId) != null) {
            contactId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        }
        return contactId;
    }
}
