package com.oops_exercises.Abstraction.FileReader;

public class App {
    static void main() {
        FileReader app=new PDFReader("2.0", "hello.pdf");
        app.readFile();
    }
}
