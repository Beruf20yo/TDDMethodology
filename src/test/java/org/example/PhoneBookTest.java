package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        String answer = phoneBook.findByName("Rin");
        Assertions.assertEquals("+79164381345",answer);
    }
    @Test
    void printAllNamesTest(){
        phoneBook.add("Rin","+79164381345");
        phoneBook.add("Accotsu","+79164399999");
        List<String> answer = phoneBook.printAllNames();
        Assertions.assertEquals(List.of("Accotsu","Rin"),answer);
    }

}