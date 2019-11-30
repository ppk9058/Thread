package learnthread;
public class HelloRunnable implements Runnable {
@Override
	public void run() {
    	for(int i=0;i<5;i++)
    	{
    		try {
    		Thread.sleep(4000);
        System.out.println("Hello from a thread!");
    		}
    		catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    	}    }
    }

    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
        String threadName =
                Thread.currentThread().getName();
            System.out.format("%s: %n",
                              threadName);
    }

}
