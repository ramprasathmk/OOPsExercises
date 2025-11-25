package com.oops_exercises.Abstraction.ReportGenerator;

public class ExcelReport extends Report {
    private int sheet;
    ExcelReport() {}
    ExcelReport(int sheet, String title) {
        super(title);
        this.sheet=sheet;
    }
    public int getSheet() {
        return sheet;
    }
    public void setSheet(int sheet) {
        this.sheet=sheet;
    }
    @Override
    public void generate() {
        System.out.println("Generating Excel Report With Title "+getTitle()+" and contains "+sheet+" sheets.");
    }
}
