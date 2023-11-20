package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @Test
    void addTest(){
        int answer = phoneBook.add("Rin","+79164381345");
        Assertions.assertEquals(1,answer);
    }
    @Test
    void findByNumberTest(){
        phoneBook.add("Rin","+79164381345");
        String answer = phoneBook.findByNumber("+79164381345");
        Assertions.assertEquals("Rin",answer);
    }
    @Test
    void findByNameTest(){
        phoneBook.add("Rin","+79164381345");
        String answer = phoneBook.findByNumber("Rin");
        Assertions.assertEquals("+79164381345",answer);
    }

}