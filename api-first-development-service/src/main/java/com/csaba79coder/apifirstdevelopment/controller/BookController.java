package com.csaba79coder.apifirstdevelopment.controller;

import com.csaba79coder.api.BooksApi;
import com.csaba79coder.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
public class BookController implements BooksApi {

    @Override
    public ResponseEntity<Book> addBook(Book body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteBook(UUID bookId, String apiKey) {
        return null;
    }

    @Override
    public ResponseEntity<Book> getBookById(UUID bookId) {
        return null;
    }

    @Override
    public ResponseEntity<Book> updateBook(Book body) {
        return null;
    }
}
