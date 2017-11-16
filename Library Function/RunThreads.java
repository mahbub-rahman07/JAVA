public class RunThreads {


	public static void main(String[] args) {
		
		Thread t1 = new Thread(new NewT("one"));
		Thread t2 = new Thread(new NewT("two"));
		Thread t3 = new Thread(new NewT("Three"));
		
		t1.start();
		t2.start();
		t3.start();

	}

}
