package com.csaba79coder.apifirstdevelopment.util;

import com.csaba79coder.apifirstdevelopment.entity.Book;
import com.csaba79coder.models.BookModel;
import com.csaba79coder.models.NewBookModel;
import org.modelmapper.ModelMapper;

public class Mapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static Book mapNewBookModelToBookEntity(NewBookModel bookModel) {
        Book book = new Book();
        modelMapper.map(bookModel, book);
        return book;
    }


    public static BookModel mapBookEntityToBookModel(Book book) {
        BookModel bookModel = new BookModel();
        modelMapper.map(book, bookModel);
        return bookModel;
    }

    private Mapper() {

    }
}
