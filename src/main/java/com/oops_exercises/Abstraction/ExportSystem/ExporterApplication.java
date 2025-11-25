package com.oops_exercises.Abstraction.ExportSystem;

public class ExporterApplication {
    static void main() {
        Exporter app1=new PDFExporter(2, "file.pdf");
        Exporter app2=new ExcelExporter(10, "ImportExportOfIndia.xlsx");
        app1.export();
        System.out.println();
        app2.export();
    }
}
