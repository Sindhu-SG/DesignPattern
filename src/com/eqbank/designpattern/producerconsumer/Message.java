package com.eqbank.designpattern.producerconsumer;

public class Message {

    Message() {

    }

    Message(int id, String message) {
        this.id = id;
        this.message = message;
    }
    private int id;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
