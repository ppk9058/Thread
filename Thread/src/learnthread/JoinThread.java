package learnthread;
import java.util.ArrayList;
class C extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<4;i++)
		{
		System.out.println("threa a"+i);
		
		}
	}
}
class D extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<4;i++)
		{
		System.out.println("threa b"+i);
		
		}
	}
}
public class JoinThread 
{
	public static void main(String[] args) throws InterruptedException
	{
		ArrayList<String> x1=new ArrayList<String>();
		x1.add("A");
	   C a1=new C();
	   D b1=new D();
	
	//a1.join();//thread b1 will execute after the complition of thread a1
	//a1.yield();
	b1.setPriority(Thread.MAX_PRIORITY);
	a1.start();
	b1.start();
	}
	}
