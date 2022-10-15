package com.eqbank.designpattern.adapter;

public class NFSFileProcessor implements FileProcessor {

    @Override
    public void openFile(String fileName) {
        System.out.println("Open file "+fileName);
    }

    @Override
    public void readContent() {
        System.out.println("Reading file ");
    }

    @Override
    public void saveContent() {
        System.out.println("Saving file ");
    }
}
