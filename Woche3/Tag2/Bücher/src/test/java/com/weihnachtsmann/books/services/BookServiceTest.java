package com.weihnachtsmann.books.services;

import com.weihnachtsmann.books.Book;
import com.weihnachtsmann.books.repo.BookRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class BookServiceTest {
    BookRepo mockRepo = mock(BookRepo.class);
    BookService service=new BookService(new BookRepo());
    /*
    private final BookService service;
    @Autowired
    public BookServiceTest(BookService service){this.service=service;}
*/
    Book book1= new Book("1", "Peter Peng");
    Book book2= new Book("2", "100001 Dalmatier");

    @Test
    void addBook() {
       when(mockRepo.addBook(book1)).thenReturn(book1);
       Book actual = service.addBook(book1);
       assertEquals(book1, actual);
    }

    @Test
    void getBookByISBN() {
        //when(mockRepo.getBookByISBN("1")).thenReturn(book1);
        service.addBook(book1);
        Book actual = service.getBookByISBN("1");
        assertEquals(book1, actual);
    }

    @Test
    void getAllBooks() {
        HashMap <String, Book> mockHash = new HashMap<>();
        mockHash.put("1", book1);
        mockHash.put("2", book2);
        when(mockRepo.getAllBooks()).thenReturn(mockHash);
        service.addBook(book1);
        service.addBook(book2);
        HashMap <String, Book> actual = service.getAllBooks();
        assertEquals(mockHash,actual);
    }

    @Test
    void deleteBookByISBN_WithMock() {
       when(mockRepo.deleteBookByISBN("1")).thenReturn(book1);
       Book actual = service.addBook(book1);
       Book expected = book1;
       assertEquals(expected, actual);
    }

    @Test
    void deleteBookByISBN(){
        //GIVEN
        BookRepo repo = new BookRepo();
        Book book1 = new Book("1", "PeterPeng");
        repo.addBook(book1);
        //WHEN
        Book actual = repo.deleteBookByISBN("1");
        //THEN
        assertEquals(book1, actual);

    }
}