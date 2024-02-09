package com.task;
public class ThreadDemo extends Thread {
	
	
	public void run()
	{
		for(int i=0;i<=10;i++){
			System.out.println("i value is="+i);
//			try {
//				Thread.sleep(5000);
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
		}
	}
	public static void main(String[] args) {
		ThreadDemo d=new ThreadDemo();
		d.start();
		for(int j=0;j<=10;j++) {
			System.out.println("j value is "+j);
		}
	}
}