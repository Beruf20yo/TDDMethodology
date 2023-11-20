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

}