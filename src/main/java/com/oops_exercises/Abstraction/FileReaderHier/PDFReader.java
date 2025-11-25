package com.oops_exercises.Abstraction.FileReaderHier;

public class PDFReader extends FileReader {
    private String version;
    PDFReader() {}
    PDFReader(String version, String fileName) {
        super(fileName);
        this.version=version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version=version;
    }

    @Override
    public void readFile() {
        System.out.println("Reading PDF file "+getFileName()+" with version "+getVersion());
    }
}
