package com.weihnachtsmann.books.controller;

import com.weihnachtsmann.books.Book;
import com.weihnachtsmann.books.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("book")
public class BookController {

    private final BookService service;

    @Autowired
    public BookController (BookService service){
        this.service = service;
    }

    @GetMapping(path="{isbn}")
    public Book getBookByISBN (@PathVariable String isbn){
        return service.getBookByISBN(isbn);
    }

    @GetMapping(path ="all")
    public Map<String, Book> getAllBooks (){
        return service.getAllBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return service.addBook(book);
    }

    @DeleteMapping (path="{isbn}")
    public Book deleteBookById(@PathVariable String isbn){
        return service.deleteBookByISBN(isbn);
    }



}
