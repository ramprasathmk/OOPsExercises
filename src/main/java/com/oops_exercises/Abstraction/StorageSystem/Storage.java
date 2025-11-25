package com.oops_exercises.Abstraction.StorageSystem;

abstract class Storage {
    private int size;
    Storage() {}
    Storage(int size) {
        this.size=size;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size=size;
    }
    abstract void save();
}
