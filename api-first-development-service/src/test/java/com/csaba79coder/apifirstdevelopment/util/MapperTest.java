package com.csaba79coder.apifirstdevelopment.util;

import com.csaba79coder.apifirstdevelopment.entity.Book;
import com.csaba79coder.apifirstdevelopment.value.Genre;
import com.csaba79coder.models.BookModel;
import com.csaba79coder.models.NewBookModel;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.assertj.core.api.BDDAssertions.then;

class MapperTest {

    @Test
    void mapNewBookModelToBookEntity() {
        // Given
        NewBookModel newBookModel = new NewBookModel().title("Cat Among the Pigeons").isbn(BigDecimal.valueOf(9780671557003L)).genre(NewBookModel.GenreEnum.NOVEL);
        Book expectedEntity = new Book();
        expectedEntity.setTitle(newBookModel.getTitle());
        expectedEntity.setIsbn(BigDecimal.valueOf(9780671557003L));
        expectedEntity.setGenre(Genre.valueOf(newBookModel.getGenre().name()));

        // When
        Book book = Mapper.mapNewBookModelToBookEntity(newBookModel);

        // Then
        then(book)
                .usingRecursiveComparison()
                .ignoringFields("id", "createdAt", "updatedAt")
                .isEqualTo(expectedEntity);
    }

    @Test
    void mapBookEntityToBookModel() {
        // Given
        Book book = new Book();
        book.setTitle("Cat Among the Pigeons");
        book.setIsbn(BigDecimal.valueOf(9780671557003L));
        book.setGenre(Genre.valueOf(Genre.DETECTIVE_FICTION.name()));

        // When
        BookModel bookModel = Mapper.mapBookEntityToBookModel(book);

        // Then
        then(bookModel)
                .usingRecursiveComparison()
                .ignoringFields("createdAt", "updatedAt")
                .isEqualTo(book);
        then(LocalDateTime.parse(bookModel.getCreatedAt()))
                .isEqualTo(book.getCreatedAt());
        then(LocalDateTime.parse(bookModel.getUpdatedAt()))
                .isEqualTo(book.getUpdatedAt());
    }
}