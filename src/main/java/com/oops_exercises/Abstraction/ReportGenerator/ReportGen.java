package com.oops_exercises.Abstraction.ReportGenerator;

public class ReportGen {
    static void main() {
        Report pdfReportGen=new PDFReport(2, "Java the Complete Reference");
        Report xlsReportGen=new ExcelReport(10, "SeventhPayCommission");
        pdfReportGen.generate();
        xlsReportGen.generate();
    }
}
