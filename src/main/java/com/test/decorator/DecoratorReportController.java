package com.test.decorator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/decorator/report")
public class DecoratorReportController {

    private final ReportService reportService;

    public DecoratorReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/generate")
    public ResponseEntity<String> generateReport() {

        reportService.generateReport();

        return ResponseEntity.ok("Report generated successfully.");
    }
}
