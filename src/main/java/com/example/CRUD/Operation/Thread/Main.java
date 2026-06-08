package com.example.CRUD.Operation.Thread;

public class Main
{
	public static void main(String[] args) throws InterruptedException {
        Mythread t1 = new  Mythread();
        Mythread t2 = new  Mythread();

        t1.start();
      //
        //
        //  t1.join();
        t2.start();


        //For Runnable
//      Thread t1 = new Thread(new Mythreadd());
//      t1.start();

    }
}
