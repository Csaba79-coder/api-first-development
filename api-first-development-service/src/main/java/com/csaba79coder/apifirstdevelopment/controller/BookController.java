package com.csaba79coder.apifirstdevelopment.controller;

import com.csaba79coder.api.BooksApi;
import com.csaba79coder.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(value = "http://localhost:8080")
public class BookController implements BooksApi {

    @Override
    public ResponseEntity<Book> addBook(Book body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteBook(UUID bookId) {
        return null;
    }

    @Override
    public ResponseEntity<Book> getBookById(UUID bookId) {
        return null;
    }

    @Override
    public ResponseEntity<List<Book>> renderAllBooks() {
        return null;
    }

    @Override
    public ResponseEntity<Book> updateBook(UUID bookId, Book body) {
        return null;
    }
}
