import java.util.Random;

public class NewT implements Runnable{
	String name;
	int time;
	Random r = new Random();
	
	public NewT(String x) {
		name  = x;
		time = r.nextInt(1000);
	}
	
	public void run(){
		
		try {
			System.out.printf("%s is sleeiping for %d\n", name,time);
			Thread.sleep(time);
			System.out.printf("%s is done\n",name);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
