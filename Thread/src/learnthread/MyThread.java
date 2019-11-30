package learnthread;

public class MyThread extends Thread {
	String name;
	Display d;
	
	public MyThread(Display d,String name) {
	this.d=d;
	this.name=name;
	
	}
	public void run()
	{
		d.wish(name);
	}

}
