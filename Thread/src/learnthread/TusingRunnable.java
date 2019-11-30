package learnthread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TusingRunnable {

	public static void main(String[] args) {

//		
//		new Thread(new Runnable(){
//		public void run()
//				{
//				for(int i=0;i<7;i++)
//				{
//					System.out.println(Thread.getAllStackTraces());
//				}
//				}}).start();
		//Lock lock = new ReentrantLock();

		new Thread(() -> { //new after java8
			//lock.lock();
		for(int i=0;i<7;i++)
				{
					System.out.println("hi");
					System.out.println(Thread.currentThread().getName());

				}
		//lock.unlock();
				}).start();


	new Thread(()->{
		//lock.lock();
		for(int i=0;i<7;i++)
		{
			System.out.println("hello");
			System.out.println(Thread.currentThread().getName());
		}
		//lock.unlock();
		}).start();

	}
	}
