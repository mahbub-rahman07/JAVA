package ArrayStructure;

import java.util.Arrays;

public class TheQueue {
	
	private String[] queueArray;
	private int front,rear;
	private int Size,Item = 0;
	
	
	public TheQueue(int size) {
		Size = size;
		queueArray = new String[Size];
		
		Arrays.fill(queueArray, "-1");
	}
	
	
	public void insert(String item) {
		if( Item+1 <= Size){
			queueArray[rear] = item;
			rear++;
			Item++;
		}else{
			prln("Queue if FUll");
			return;
		}
	}
	
	public void remove() {
		if(Item > 0){
			
			queueArray[front] = "=1";
			front++;
			Item--;
		}else{
			prln("Queue is Empty");
			return;
		}
	}
	
	public void peek() {
		prln(queueArray[front]);
		return;
	}
	
	
	public void PiorityInsert(String input) {
		
		
		int i;
		
		if(Item == 0){
			insert(input);
		}else{
			
			for(i = Item-1 ;i>=0;i--){
				if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])){
					queueArray[i+1] = queueArray[i];
				}else{
					break;
				}
			}
			queueArray[i+1] = input;
			rear++;
			Item++;
		}
	}
		
	
/** ----------------------Print Full Stack FUNCTION --------------------------**/	
	public void displayQueue() {
		System.out.println("----------");
		
		for(int i=0;i<Size;i++){
			pr("| "+i+" | ");
			prln(queueArray[i] + " | ");
			
			prln("----------");
		
		}
	}
	
	

	public static void main(String[] args) {
		
		TheQueue queue = new TheQueue(10);
		
//		queue.insert("55");
//		queue.displayQueue();
//		queue.insert("65");
//		queue.remove();
//		prln("\n");
		
		queue.PiorityInsert("77");
		queue.PiorityInsert("70");
		queue.PiorityInsert("44");
		queue.PiorityInsert("99");
		queue.displayQueue();
		queue.peek();
		
	}
/** ----------------------my custom FUNCTION --------------------------**/
	static void prln(Object any){
		System.out.println(any);
	}
	static void pr(Object any){
		System.out.print(any);
	}
}
