package com.design.patterns.decorator;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class LoggingReportService implements ReportService {

    private final BaseReportService baseReportService;

    public LoggingReportService(BaseReportService baseReportService) {
        this.baseReportService = baseReportService;
    }

    public void generateReport() {

        System.out.println("Starting report generation...");
        baseReportService.generateReport();
        System.out.println("Report generation finished.");
    }
}

