package com.eqbank.designpattern.adapter;

public class CloudFileProcessor {

    public void connect(String connectionString, String fileName){
        System.out.println("Connecting to remote "+connectionString+ " :: reading file "+fileName);
    }

    public void upload(){
        System.out.println("Uploading content");
    }

    public void download(){
        System.out.println("Downloading content");
    }
}
