package com.oops_exercises.Abstraction.ExportSystem;

abstract class Exporter {
    private String file;

    Exporter() {}

    Exporter(String file) {
        this.file=file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file=file;
    }

    abstract void export();
}
