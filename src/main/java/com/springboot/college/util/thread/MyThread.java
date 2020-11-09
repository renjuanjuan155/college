package com.springboot.college.util.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description
 * @Date 2020/6/1 14:44
 * @Created by ren
 */
public class MyThread implements Runnable {
    private int ticket;
    private AtomicInteger tickets;
    public MyThread(int ticket){
        this.ticket = ticket;
    }
    public MyThread(){

    }

    @Override
    public void run() {
        int count ;
        while (true){

            synchronized (this){
                String threadName = Thread.currentThread().getName();
                if (--ticket>=0){
                    System.out.println(threadName+"剩余"+ticket +"张");
                }else {
                    System.out.println(threadName+"售完");
                    return;
                }
            }
            try {
                java.lang.Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
