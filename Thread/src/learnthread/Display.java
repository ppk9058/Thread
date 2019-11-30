package learnthread;

public class Display {
	String name;
	
	public synchronized void wish(String name)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Good Morning" +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println(name);
	}
	}

}
