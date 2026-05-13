package com.example.contacts;

public class FileCorruptedException extends RuntimeException {

    public FileCorruptedException(String msg) {
        super(msg);
    }
}
