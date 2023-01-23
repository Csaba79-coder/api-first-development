package com.csaba79coder.apifirstdevelopment.service;

import com.csaba79coder.apifirstdevelopment.persistence.LogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogService {

    private final LogRepository logRepository;
}
