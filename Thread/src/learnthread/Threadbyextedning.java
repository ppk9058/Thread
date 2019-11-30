package learnthread;

//import java.lang.Thread.State;

class A1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{
				Thread.sleep(4000);
			
			System.out.println(" class A"+i);
			}
			catch(Exception e)
			{
				System.out.println("Exception occured");
			}
		}
		String threadName =
                Thread.currentThread().getName();
            System.out.format("%s: %n",
                              threadName);
	}
	
}
class B1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(" class B"+i);
			
		}
		//Threadbyextedning.a1.getState();
		String threadName =
                Thread.currentThread().getName();
            System.out.format("%s: %n",
                              threadName);
	}
}
public class Threadbyextedning {

	public static void main(String[] args) {
		//A1 a1=new A1();
		B1 b1=new B1();
		
		//a1.start();
		(new A1()).start();
		String threadName =
                Thread.currentThread().getName();
            System.out.format("%s: %n",
                              threadName);
		b1.start();

	}

}
