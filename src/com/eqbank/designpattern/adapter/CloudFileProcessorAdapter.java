package com.eqbank.designpattern.adapter;

public class CloudFileProcessorAdapter implements FileProcessor{
    CloudFileProcessor cloudFileProcessor;

    String connectionString = "azure.com";
    CloudFileProcessorAdapter(CloudFileProcessor cloudFileProcessor) {
        this.cloudFileProcessor = cloudFileProcessor;
    }

    @Override
    public void openFile(String fileName) {
        this.cloudFileProcessor.connect(connectionString, fileName);
    }

    @Override
    public void readContent() {
        this.cloudFileProcessor.download();
    }

    @Override
    public void saveContent() {
        this.cloudFileProcessor.upload();
    }
}
