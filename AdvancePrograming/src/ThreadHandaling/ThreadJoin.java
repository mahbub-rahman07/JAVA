package ThreadHandaling;

public class ThreadJoin {
	private int count = 0;
	private synchronized void increament() {
		count++;
	}
	
	public static void main(String[] args) {
		ThreadJoin T1 = new ThreadJoin();
		T1.Gorun();

	}

	public void Gorun() {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 100; i++){
					increament();
				}
				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int j = 0; j< 100; j++){
					increament();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
		
	}

}
