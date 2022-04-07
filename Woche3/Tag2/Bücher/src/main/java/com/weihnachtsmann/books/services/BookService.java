package com.weihnachtsmann.books.services;

import com.weihnachtsmann.books.Book;
import com.weihnachtsmann.books.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepo repo;

    @Autowired
    public BookService(BookRepo repo) {
        this.repo = repo;
    }

    public Book addBook(Book book) {
        return repo.addBook(book);
    }

    public Book getBookByISBN(String isbn) {
        Optional<Book> book = repo.getBookByISBN(isbn);
        return book.orElseThrow();
    }



    public HashMap<String, Book> getAllBooks() {
        return repo.getAllBooks();
    }

    public Book deleteBookByISBN(String isbn) {
        return repo.deleteBookByISBN(isbn);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookService that = (BookService) o;
        return Objects.equals(repo, that.repo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repo);
    }

    @Override
    public String toString() {
        return "bookService{" + "repo=" + repo + '}';
    }
}
