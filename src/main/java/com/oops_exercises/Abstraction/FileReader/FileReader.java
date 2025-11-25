package com.oops_exercises.Abstraction.FileReader;

abstract class FileReader {
    String fileName;

    FileReader() {}

    FileReader(String fileName) {
        this.fileName=fileName;
    }

    abstract void readFile();
}
