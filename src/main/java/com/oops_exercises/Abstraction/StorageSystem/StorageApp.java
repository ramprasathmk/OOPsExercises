package com.oops_exercises.Abstraction.StorageSystem;

public class StorageApp {
    static void main() {
        Storage localStorage=new LocalStorage("../data/data.txt", 10);
        Storage cloudStorage=new CloudStorage("azure.com", 20);
        localStorage.save();
        cloudStorage.save();
    }
}
