package learnthread;

public class OneThread extends Thread {
	
	 @Override
	public void run()
	{
	
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inside main");
		OneThread ob1=new OneThread();
		
        ob1.start();//thread 1 of onethread
        //ob1.wait(2000);
        for(int i=0;i<10;i++)//this will be thread 2 as main thread both will run concurrently
        {
        	System.out.println("Inside main:"+i);
        }
	}
	
	
	
	

}
