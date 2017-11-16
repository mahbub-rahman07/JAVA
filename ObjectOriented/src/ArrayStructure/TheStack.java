package ArrayStructure;

import java.util.Arrays;


public class TheStack {
	
	private String[] stackArray;
	private int Size;
	private int top = -1;
	
	public TheStack(int size) {
		Size = size;
		
		stackArray = new String[Size];
		
		Arrays.fill(stackArray, "-1");
	}
	
	public void push(String input) {
		if(top+1 < Size){
			
			top++;
			stackArray[top] = input;
		}else{
			prln("Stack is Overflow");
			return ;
		}
	}
	public void Multipush(String value) {
		String[] temp = value.split(" ");
		
		for(int i=0;i<temp.length;i++){
			push(temp[i]);
		}
	}
	
	public String pop() {
		
		String value = "-1";
		if(top >= 0){
		   value = stackArray[top];
			stackArray[top--] = "-1";
			
		}else{
			prln("Stack Underflow");
		}
		return value;
	}
	
	public String peek() {
		prln(stackArray[top]);
		
		return stackArray[top];
	}
	
/** ----------------------Print Full Stack FUNCTION --------------------------**/	
	public void displayStack() {
		System.out.println("----------");
		
		for(int i=0;i<Size;i++){
			pr("| "+i+" | ");
			prln(stackArray[i] + " | ");
			
			prln("----------");
		
		}
	}
	
/** ----------------------Main  FUNCTION --------------------------**/
	public static void main(String[] args) {
		
		TheStack Stack = new TheStack(10);
//		Stack.push("22");
//		Stack.push("24");
//		Stack.push("26");
//		Stack.displayStack();
//		prln(Stack.pop());
//		prln(Stack.pop());
//		Stack.displayStack();
//		prln(Stack.pop());
//		prln(Stack.pop());
		
		Stack.Multipush("11 12 33 44 55 66");
		Stack.displayStack();
		Stack.pop();
		prln("\n____________\n");
		Stack.displayStack();
		
		
		
		

	}
/** ----------------------my custom FUNCTION --------------------------**/
	static void prln(Object any){
		System.out.println(any);
	}
	static void pr(Object any){
		System.out.print(any);
	}
	

}
