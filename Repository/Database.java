package Repository;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Contact> contacts = new ArrayList<>();

    // Constructor
    public Database() {
        contacts.add(new Contact("John Doe", 1234567890L, "john@email.com"));
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public int getCounter() {
        return contacts.size();
    }

   
}
