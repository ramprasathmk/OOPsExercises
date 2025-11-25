package com.oops_exercises.Abstraction.FileReaderHier;

public class WordReader extends FileReader {
    int docVersion;
    WordReader() {}
    WordReader(int docVersion, String fileName) {
        super(fileName);
        this.docVersion=docVersion;
    }

    @Override
    public void readFile() {
        System.out.println("Reading Word file "+getFileName()+" with Document Version "+docVersion);
    }
}
