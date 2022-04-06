package com.weihnachtsmann.books;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    String isbn;
    String title;
}

