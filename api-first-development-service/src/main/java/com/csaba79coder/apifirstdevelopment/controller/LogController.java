package com.csaba79coder.apifirstdevelopment.controller;

import com.csaba79coder.api.LogsApi;
import com.csaba79coder.apifirstdevelopment.service.LogService;
import com.csaba79coder.models.LogModel;
import com.csaba79coder.models.NewLogModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LogController implements LogsApi {

    private final LogService logService;

    @Override
    public ResponseEntity<LogModel> addLog(NewLogModel body) {
        return null;
    }

    @Override
    public ResponseEntity<List<LogModel>> renderAllLogs() {
        return null;
    }
}
