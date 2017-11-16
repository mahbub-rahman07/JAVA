
public class Thread2 extends Thread{
	public void run() {
		for(int i = 1 ; i < 5 ; i++){
			System.out.println("Prinint from Threar Two ..."+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("End of Thread Two");
	}
}
