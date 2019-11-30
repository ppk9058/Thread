package learnthread;

class A implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(" class A"+i);
		}
	}
}
class B implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(" class B"+i);
			
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class FirstThread {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		Thread ob1=new Thread(a1);//new stat
		Thread ob2=new Thread(b1);
		ob1.start();//runnable
		ob2.setPriority(10);
		Thread t=Thread.currentThread();
		t.setName("My thread");
		System.out.println(t);
		ob1.suspend();//thread will be entred into the suspended state.like govt employee suspended
		ob1.resume();//we can resueme a suspended thread by using this method,then suspended thread can continue its execution.These two method are not recommonde to use.
		ob2.start();
	}

}
