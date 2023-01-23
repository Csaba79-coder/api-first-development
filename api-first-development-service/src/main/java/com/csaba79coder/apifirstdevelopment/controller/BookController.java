package com.csaba79coder.apifirstdevelopment.controller;

import com.csaba79coder.api.BooksApi;
import com.csaba79coder.apifirstdevelopment.service.BookService;
import com.csaba79coder.models.BookModel;
import com.csaba79coder.models.ModifiedBookModel;
import com.csaba79coder.models.NewBookModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(value = "http://localhost:8080")
@RequiredArgsConstructor
public class BookController implements BooksApi {

    private final BookService bookService;

    @Override
    public ResponseEntity<BookModel> addBook(NewBookModel body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteBook(UUID bookId) {
        return null;
    }

    @Override
    public ResponseEntity<BookModel> getBookById(UUID bookId) {
        return null;
    }

    @Override
    public ResponseEntity<List<BookModel>> renderAllBooks() {
        return null;
    }

    @Override
    public ResponseEntity<BookModel> updateBook(UUID bookId, ModifiedBookModel body) {
        return null;
    }
}
