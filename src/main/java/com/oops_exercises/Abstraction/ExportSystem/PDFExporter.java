package com.oops_exercises.Abstraction.ExportSystem;

public class PDFExporter extends Exporter {
    private int pdfVer;
    PDFExporter() {}
    PDFExporter(int pdfVer, String file) {
        super(file);
        this.pdfVer=pdfVer;
    }

    public int getPdfVer() {
        return pdfVer;
    }

    public void setPdfVer(int pdfVer) {
        this.pdfVer=pdfVer;
    }

    @Override
    void export() {
        System.out.println("Exporting PDF File "+getFile()+" with version-"+pdfVer+".");
    }
}
