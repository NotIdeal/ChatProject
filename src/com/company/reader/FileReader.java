package com.company.reader;


public class FileReader implements Reader{
    private String path;

    public FileReader(String path){
        this.path = path;
    }

    @Override
    public String read() {
        return ("Reading file from: " +
                this.path);
    }
}
