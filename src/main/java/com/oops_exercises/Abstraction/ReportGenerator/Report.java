package com.oops_exercises.Abstraction.ReportGenerator;

abstract class Report {
    private String title;
    Report() {}
    Report(String title) {
        this.title=title;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title=title;
    }
    abstract void generate();
}
