package learnthread;
import java.util.ArrayList;
public class ConsumerPP {
public static void main(String[] args) {
		ArrayList<Integer> goods = new ArrayList<Integer>();
		Thread t1=new Thread(new producer(goods));
		Thread t2=new Thread(new consumer(goods));
		t1.start();
		t2.start();
	}
}
class producer implements Runnable
{
	ArrayList<Integer> goods=null;
	final int MAX_SIZE=5;
	private int i=0;
	public producer(ArrayList<Integer> goods) {
		super();
		this.goods = goods;
	}
@Override
	public void run() {
	 while(true)
		{
		try {
			produce(i++);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}}
	
	public void produce(int i) throws InterruptedException 
	{
		synchronized(goods)
		{
		while(goods.size()==MAX_SIZE) {
		System.out.println("container is full");
		goods.wait();
		}
			System.out.println("producer produced"+i);
			goods.add(i);
			Thread.sleep(1000);
			goods.notify();
}
}
}
class consumer implements Runnable
{
	ArrayList<Integer> goods=null;
	public consumer(ArrayList<Integer> goods) {
		super();
		this.goods = goods;
	}

	@Override
	public void run() {
	 while(true) {
		try {
			consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}}
	
	public void consume() throws InterruptedException 
	{
		synchronized(goods)
		{
		while(goods.isEmpty()) {
		System.out.println(" add in container");
		goods.wait();
		}
		
		    Thread.sleep(1000);
			System.out.println("consumer the element"+ goods.remove(0));
			goods.remove(0);
			goods.notify();
	}
}
}

