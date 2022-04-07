package com.weihnachtsmann.books.services;

import com.weihnachtsmann.books.Book;
import com.weihnachtsmann.books.repo.BookRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.HashMap;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class BookServiceTest {
    BookRepo mockRepo = mock(BookRepo.class);
    BookService service=new BookService(new BookRepo());

    Book book1= new Book("1", "Peter Peng");
    Book book2= new Book("2", "100001 Dalmatier");

    @Test
    void addBook_ST() {
       when(mockRepo.addBook(book1)).thenReturn(book1);
       Book actual = service.addBook(book1);
       assertEquals(book1, actual);
    }

    @Test
    void getBookByISBN_STAndRT() {
        //when(mockRepo.getBookByISBN("1")).thenReturn(book1);
        service.addBook(book1);
        Book actual = service.getBookByISBN("1");
        assertEquals(book1, actual);
    }

    @Test
    void getBookByISBN_WhenISBNNotFound_STAndRT(){
        assertThrows(NoSuchElementException.class, ()->service.getBookByISBN("5000"));
    }

    @Test
    void getAllBooks_STAndRT() {
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
    void deleteBookByISBN_ST() {
       when(mockRepo.deleteBookByISBN("1")).thenReturn(book1);
       Book actual = service.addBook(book1);
       Book expected = book1;
       assertEquals(expected, actual);
    }


}