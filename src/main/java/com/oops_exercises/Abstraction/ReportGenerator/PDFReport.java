package com.oops_exercises.Abstraction.ReportGenerator;

public class PDFReport extends Report {
    private int version;
    PDFReport() {}
    PDFReport(int version, String title) {
        super(title);
        this.version=version;
    }
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version=version;
    }
    @Override
    public void generate() {
        System.out.println("Generating PDF Report With Title "+getTitle()+", Revised Version: v"+version+".");
    }
}
