package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add("John Doe", "1234567890");
        assertEquals(1, result);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Doe", "1234567890");
        String name = phoneBook.findByNumber("1234567890");
        assertEquals("John Doe", name);
    }
}