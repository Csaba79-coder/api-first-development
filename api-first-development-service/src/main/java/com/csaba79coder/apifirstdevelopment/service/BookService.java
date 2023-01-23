package com.csaba79coder.apifirstdevelopment.service;

import com.csaba79coder.apifirstdevelopment.persistence.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

}
