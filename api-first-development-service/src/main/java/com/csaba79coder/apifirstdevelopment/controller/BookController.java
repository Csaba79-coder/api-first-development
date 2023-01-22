package com.csaba79coder.apifirstdevelopment.controller;

import com.csaba79coder.api.LibraryApi;
import com.csaba79coder.models.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class BookController implements LibraryApi {

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        return null;
    }
}
