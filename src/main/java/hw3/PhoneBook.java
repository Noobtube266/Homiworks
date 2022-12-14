package hw3;

import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this.phonebook = new HashMap<String, List<String>>();
    }

    public void add(String name, String phoneNumber) {
        this.phonebook.put(name, new ArrayList<String>(Arrays.asList(phoneNumber)));
    }

    public void addAll(String name, String... phoneNumbers) {
        this.phonebook.put(name, Arrays.asList(phoneNumbers));

    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        if (phonebook.containsKey(name)) {
            return true;
        }
        return false;
    }


    public List<String> lookup(String name) {
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet())
            if (phonebook.containsKey(name)) {
                return phonebook.get(name);

            }

        return null;
    }

    public String reverseLookup(String phoneNumber) {

        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        return new ArrayList<>(phonebook.keySet());
    }



    public Map<String, List<String>> getMap() {
        return this.phonebook;

    }
}
