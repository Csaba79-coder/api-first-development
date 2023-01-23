package com.csaba79coder.apifirstdevelopment.controller;

import com.csaba79coder.apifirstdevelopment.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;
}
