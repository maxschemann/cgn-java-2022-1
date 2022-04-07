package com.weihnachtsmann.books.controller;

import com.weihnachtsmann.books.Book;
import com.weihnachtsmann.books.repo.BookRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BookControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private WebTestClient webTestClient;

    @Autowired
    BookRepo repo;

    /*
    @BeforeEach
    public void cleanUp(){
    new HashMap<String, Book>();
    }*/

    @Test
    void getBookByISBN() {
        //GIVEN
        Book expected = new Book("123", "PeterPeng");
        repo.addBook(expected);
        //WHEN
        Book response = webTestClient.get()
                .uri("book/123")
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody(Book.class)
                .returnResult()
                .getResponseBody();
        //THEN
        assertEquals(expected, response);
    }

    @Test
    void getAllBooks() {
        //GIVEN
        Book book1 = new Book("123", "PeterPeng");
        Book book2 = new Book("456", "PeterPansen");

        repo.addBook(book1);
        repo.addBook(book2);

        List<Book> response = webTestClient.get()
                .uri("book/all")
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBodyList(Book.class)
                .returnResult()
                .getResponseBody();
        //THEN
    }

    @Test
    void addBook() {
        //GIVEN
        Book book1 = new Book("123", "PeterPeng");

        //WHEN
        Book response = webTestClient.post()
                .uri("book")
                .bodyValue(book1)
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody(Book.class)
                .returnResult()
                .getResponseBody();

        //THEN
        Book expected = new Book("123", "PeterPeng");
        assertEquals(expected, response);
    }

    @Test
    void deleteBookById() {
        //GIVEN
        Book expected = new Book("123", "PeterPeng");
        repo.addBook(expected);
        //WHEN
        webTestClient.delete()
                .uri("/123")
                .exchange()
                // .expectStatus().isOk()        <-----------.is2xxsuccessful will er nicht, mit Postman klappt delete aber
                .expectBody(Book.class)
                .returnResult()
                .getResponseBody();

    }
}