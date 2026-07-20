package com.nit.Multithreading;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child thread is running");
	}
}

public class MyThreadDemo
{
	public static void main(String[] args) 
	{
		MyThread thread = new MyThread();
		thread.start();   // start method is used for creating a new thread 
		System.out.println("Main thread");
	}
}
