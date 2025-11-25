package com.oops_exercises.Abstraction.FileReaderHier;

public class App {
    static void main() {
        FileReader app1=new PDFReader("2.0", "hello.pdf");
        app1.readFile();
        FileReader app2=new WordReader(2, "file.docx");
        app2.readFile();
    }
}
