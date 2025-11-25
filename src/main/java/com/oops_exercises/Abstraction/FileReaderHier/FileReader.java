package com.oops_exercises.Abstraction.FileReaderHier;

abstract class FileReader {
    private String fileName; // set access modifier to Protected to access its child classes

    FileReader() {}

    FileReader(String fileName) {
        this.fileName=fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName=fileName;
    }

    abstract void readFile();
}
