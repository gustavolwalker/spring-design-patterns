package com.test.decorator;

import org.springframework.stereotype.Service;

@Service
public class BaseReportService implements ReportService {

    public void generateReport() {

        System.out.println("Generating base report...");
    }
}
