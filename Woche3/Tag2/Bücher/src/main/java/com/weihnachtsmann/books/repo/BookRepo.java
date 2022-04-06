package com.weihnachtsmann.books.repo;

import com.weihnachtsmann.books.Book;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;

@Repository
public class BookRepo {
    HashMap<String, Book> repo = new HashMap<>();

    public Book addBook (Book book){
        repo.put(book.getIsbn(), book);
        return book;
    }

    public Book getBookByISBN (String isbn){
        return repo.get(isbn);
    }

    public HashMap<String, Book> getAllBooks (){
        return repo;
    }

    public Book deleteBookByISBN (String isbn){
        Book book = repo.get(isbn);
        repo.remove(isbn);
        return book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookRepo bookRepo = (BookRepo) o;
        return Objects.equals(repo, bookRepo.repo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repo);
    }

    @Override
    public String toString() {
        return "BookRepo{" +
                "repo=" + repo +
                '}';
    }
}
