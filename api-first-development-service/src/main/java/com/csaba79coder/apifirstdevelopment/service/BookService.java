package com.csaba79coder.apifirstdevelopment.service;

import com.csaba79coder.apifirstdevelopment.entity.Book;
import com.csaba79coder.apifirstdevelopment.entity.Log;
import com.csaba79coder.apifirstdevelopment.persistence.BookRepository;
import com.csaba79coder.apifirstdevelopment.persistence.LogRepository;
import com.csaba79coder.apifirstdevelopment.util.ISBN13Validator;
import com.csaba79coder.apifirstdevelopment.util.Mapper;
import com.csaba79coder.models.BookModel;
import com.csaba79coder.models.ModifiedBookModel;
import com.csaba79coder.models.NewBookModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookService {
    private final LogRepository logRepository;

    private final BookRepository bookRepository;
    private Log systemLog;

    public BookModel addNewBook(NewBookModel newModel) {
        if (newModel.getIsbn() == null || !ISBN13Validator.isValidISBN(newModel.getIsbn())
                || newModel.getTitle().isEmpty() || newModel.getTitle().isBlank()
                || newModel.getGenre() == null) {
            String message = String.format("Please represent a valid isbn input, isbn: %s is not valid!", newModel.getIsbn());
            systemLog = new Log(message);
            logRepository.save(systemLog);
            log.info(message);
            throw  new InputMismatchException(message);
        } else {
            return Mapper.mapBookEntityToBookModel(bookRepository.save(Mapper.mapNewBookModelToBookEntity(newModel)));
        }
    }

    public void deleteAnExistingBookById(UUID id) {
        Book book = bookRepository.findBookById(id)
                .orElseThrow(() -> {
                    String message = String.format("Book with id: %s was not found", id);
                    systemLog = new Log(message);
                    logRepository.save(systemLog);
                    log.info(message);
                    return new NoSuchElementException(message);
                });
        bookRepository.delete(book);
    }

    public BookModel getBookById(UUID id) {
        return null;
    }

    public List<BookModel> renderAllBooks() {
        return null;
    }

    public BookModel updateAnExistingBook(UUID id, ModifiedBookModel modifyBook) {
        return null;
    }
}
