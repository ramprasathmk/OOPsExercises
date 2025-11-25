package com.oops_exercises.Abstraction.StorageSystem;

public class CloudStorage extends Storage {
    private String url;

    CloudStorage() {}

    CloudStorage(String url, int size) {
        super(size);
        this.url=url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url=url;
    }

    @Override
    public void save() {
        System.out.println("Data uploaded in the Repo "+url+" contains "+getSize()+" megabytes.");
    }
}
