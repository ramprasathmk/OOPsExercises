package com.oops_exercises.Abstraction.ExportSystem;

public class ExcelExporter extends Exporter {
    private int sheet;
    ExcelExporter() {}
    ExcelExporter(int sheet, String file) {
        super(file);
        this.sheet=sheet;
    }

    public int getSheet() {
        return sheet;
    }

    public void setSheet(int sheet) {
        this.sheet=sheet;
    }

    @Override
    void export() {
        System.out.println("Exporting Spreadsheet "+getFile()+" with "+sheet+" sheets.");
    }
}
