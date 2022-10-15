package com.eqbank.designpattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {

        NFSFileProcessor nfsFileProcessor = new NFSFileProcessor();
        nfsFileProcessor.openFile("batch.txt");
        nfsFileProcessor.readContent();
        nfsFileProcessor.saveContent();

        CloudFileProcessor cloudFileProcessor = new CloudFileProcessor();
        cloudFileProcessor.connect("azure.com", "batch1.txt");
        cloudFileProcessor.upload();
        cloudFileProcessor.download();


        CloudFileProcessorAdapter cloudFileProcessorAdapter = new CloudFileProcessorAdapter(cloudFileProcessor);
        cloudFileProcessorAdapter.openFile("batch.txt");
        cloudFileProcessorAdapter.saveContent();
        cloudFileProcessorAdapter.readContent();


    }
}
