package com.csaba79coder.apifirstdevelopment.service;

import com.csaba79coder.apifirstdevelopment.entity.Book;
import com.csaba79coder.apifirstdevelopment.persistence.BookRepository;
import com.csaba79coder.models.BookModel;
import com.csaba79coder.models.NewBookModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookService {

    private final BookRepository bookRepository;

    public BookModel addNewBook(NewBookModel newModel) {

        return null;
    }

    public void deleteAnExistingBookById(UUID id) {
        Book book = bookRepository.findBookById(id)
                .orElseThrow(() -> {
                    String message = String.format("Book with id: %s was not found", id);
                    log.info(message);
                    return new NoSuchElementException(message);
                });
        bookRepository.delete(book);
    }
}
