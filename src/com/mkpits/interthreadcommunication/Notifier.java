package com.mkpits.interthreadcommunication;

public class Notifier implements Runnable {
    
    private Message msg;

    public Notifier (Message m){
        this.msg = m;
    }

    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name + "started");
        synchronized(msg){
            msg.setMsg(name + " work done");
            msg.notifyAll();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
            }
        }
    }
}