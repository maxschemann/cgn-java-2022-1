package com.weihnachtsmann.books.repo;

import com.weihnachtsmann.books.Book;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class BookRepoTest {

    @Test
    void deleteBookByISBN() {
        Book expected = new Book("123","PeterPeng");
        BookRepo actualRepo = new BookRepo();
        actualRepo.addBook(new Book("123","PeterPeng"));
        Book actual = actualRepo.deleteBookByISBN("123");
        assertEquals(expected, actual);
    }
}