package org.example;

import java.util.HashMap;
import java.util.Map;


public class PhoneBook {
    private final Map<String,String> phoneBook = new HashMap<>();

    public int add(String name, String phoneNumber) {
        phoneBook.put(name,phoneNumber);
        return phoneBook.size();
    }
    public String findByNumber(String phoneNumber){
        for (Map.Entry<String,String> pair : phoneBook.entrySet()) {
            if (phoneNumber.equals(pair.getValue())) {
                return pair.getKey();
            }
        }
        return null;
    }
    public String findByName(String name){
        return phoneBook.get(name);
    }
    public String printAllNames(){
        return null;
    }
}
