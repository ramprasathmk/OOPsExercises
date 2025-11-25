package com.oops_exercises.Abstraction.StorageSystem;

public class LocalStorage extends Storage {
    private String path;

    LocalStorage() {}

    LocalStorage(String path, int size) {
        super(size);
        this.path=path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path=path;
    }

    @Override
    public void save() {
        System.out.println("Data stored in the path "+path+" contains "+getSize()+" megabytes.");
    }
}
