package com.eqbank.designpattern.producerconsumer;


public class Producer implements Runnable {
    private final DataQueue dataQueue;
    private volatile boolean runFlag;

    private static int idSequence = 0;

    public Producer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
        runFlag = true;
    }

    @Override
    public void run() {
        produce();
    }

    public void produce() {
        while (runFlag) {
            Message message = generateMessage();
            while (dataQueue.isFull()) {
                try {
                    dataQueue.waitOnFull();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
            if (!runFlag) {
                break;
            }
            dataQueue.add(message);
            dataQueue.notifyAllForEmpty();
        }
        System.out.println("Producer Stopped");
    }

    private Message generateMessage() {
        int id = ++idSequence;
        Message message = new Message(id, "Message "+id);
        System.out.printf("[%s] Generated Message. Id: %d, Data: %s\n", Thread.currentThread().getName(), message.getId(), message.getMessage());

        //Sleeping on random time to make it realistic
        ThreadUtil.sleep((long) (message.getId() * 100));

        return message;
    }

    public void stop() {
        runFlag = false;
        dataQueue.notifyAllForFull();
    }
}