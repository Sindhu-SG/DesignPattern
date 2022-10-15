package com.eqbank.designpattern.adapter;

public interface FileProcessor {

    public void openFile(String fileName);

    public void readContent();

    public void saveContent();
}
