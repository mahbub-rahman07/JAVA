package Threading;

import java.util.Scanner;

public class RunMyThread {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("Robot1", 1, 100, 10, 100, null,true);
		MyThread t2 = new MyThread("Robot2", 100, 1000, 100, 1000, null,true);
		MyThread t3 = new MyThread("Robot3", 200, 2000, 100, 2000, null,true);
		t1.start();
		t2.start();
		t3.start();
		String cmd;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("Enter Thread Number ...: ");
			cmd = sc.nextLine();
			if(cmd.toLowerCase().equals("exit")){
				break;
			}
			if(cmd.equals("1")){
				System.out.println(t1.counter);
			}else if(cmd.equals("2")){
				System.out.println(t2.counter);
			}
			else if(cmd.equals("3")){
				System.out.println(t3.counter);
			}
			else if(cmd.equals("1s")){
				t1.stopThread();
			}
			else if(cmd.equals("2s")){
				t2.stopThread();
			}
			else if(cmd.equals("3s")){
				t3.stopThread();
			}else{
				System.out.println("wrong key");
			}
			
		}

	}

}
