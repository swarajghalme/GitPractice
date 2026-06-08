package com.example.CRUD.Operation.Thread;

public class Mythread extends Thread {

    //private static final Object lock = new Object();
    @Override
    public synchronized void run() {
       // synchronized (lock) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);

                try{
                    Thread.sleep(500);

                }catch(Exception e){}
            }


    }


}
