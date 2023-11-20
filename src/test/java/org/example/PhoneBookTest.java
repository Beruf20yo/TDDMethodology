package org.example;

import org.junit.Assert;

class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    void addTest(){
        int answer = phoneBook.add("Rin","+79164381345");
        Assert.assertEquals(1,answer);
    }

}