package Threading;

public class MyThread extends Thread{
	String ThreadName;
	int starPoint;
	int counter;
	int adder;
	int timedif;
	MyThread depentThread;
	boolean flag;
	public MyThread(String threadName, int starPoint, int counter, int adder, int timedif, MyThread depentThread,
			boolean flag) {
		super();
		ThreadName = threadName;
		this.starPoint = starPoint;
		this.counter = counter;
		this.adder = adder;
		this.timedif = timedif;
		this.depentThread = depentThread;
		this.flag = flag;
	}
	
	public void run() {
		counter = starPoint;
		if (depentThread != null) {
			try {
				depentThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while(flag){
			counter += adder;
			try {
				sleep(timedif);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void stopThread() {
		flag = false;
	}
	
	
	
}
