package ArrayStructure;
import java.util.*;

public class ArrayStructures {
/* ----------------------CLASS MEMBERS --------------------------*/
		
		private int[] theArray = new int[50];
		private int Size = 10;

/* ----------------------Random Value Generate FUNCTION --------------------------*/
		
		public void GenRanArray(){
			
			for(int i=0 ;i<Size ; i++){
				
				theArray[i] = (int)(Math.random()*10)+10;
			}
		}
/* ----------------------Print FUll Array FUNCTION --------------------------*/
		public void PrintArray(){
			
			System.out.println("----------");
			
			for(int i=0;i<Size;i++){
				pr("| "+i+" -> ");
				prln(theArray[i] + " | ");
				
				prln("----------");
			
			}
		}
/* ----------------------INDEX VALUE FUNCTION --------------------------*/		
		public int getIndexValue(int index){
			if(index < Size){
				return theArray[index];
			}else {
				return 0;
			}
		}

/* ----------------------Search VALUE FUNCTION --------------------------*/
		
		public boolean IsExistValue(int value){
			
			boolean exist = false;
			
			for(int i=0;i<Size;i++){
				if(theArray[i] == value){
					exist = true;
					break;
				}
			}
			return exist;	
		
		}
		
/* ----------------------Delete FUNCTION --------------------------*/
		public void DeleteIndex(int index){
		
			if(index <Size){
				for(int i = index ;i< (Size - 1);i++){
					theArray[i] = theArray[i+1];
				}
				Size--;
			}
		}
		
/* ----------------------Insert FUNCTION --------------------------*/
		public void Insert(int value){
			
			if(Size < theArray.length){
				theArray[Size++] = value;
			}else{
				prln("THE ARRAY OVERFLOW :( ");
			}
			
		}
/* ----------------------Liear Search FUNCTION --------------------------*/


	public String Linear(int v){
		pr("The value was found at : ");
		String index = "";
		boolean Value = false;
		
		for(int i=0;i<Size;i++){
			if(theArray[i] == v){
				Value = true;
				index += i+" ";
			
			}
		
		}
		
		if(!Value){
			index = "NONE";
		}
		
		return index;
		
	}
/* ----------------------Selection Sort FUNCTION --------------------------*/

 	public void Swap(int a,int b){
		int t = theArray[a];
		theArray[a] = theArray[b];
		theArray[b] = t;
	}



	public void SelectionSort(){
		prln("--- After Selection Sort THE Array ---");
	
		for(int i = 0;i<Size ;i++){
			int min = i;
			
			for(int j = i;j<Size;j++){
				if(theArray[min] > theArray[j]){
					min = j;
				}
			}
			Swap(i, min);
		}
	}
	
	public void InsertionSort(){
		prln("--- After Insertion Sort THE Array ---");
	
		for(int i=1;i<Size ;i++){
		
			int j = i;
			int toinsert = theArray[i];
			
			
			while((j>0) && theArray[j-1] > toinsert){
				theArray[j] = theArray[j-1];
				j--;
			}
			theArray[j] = toinsert;
		}
	
	}
	



/* ----------------------MAIN FUNCTION --------------------------*/

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			
			ArrayStructures myArray = new ArrayStructures();
			
			myArray.GenRanArray();
			myArray.PrintArray();
			//prln(myArray.getIndexValue(9));
			//prln("Entered value for Search in Array is : "+myArray.IsExistValue(sc.nextInt()));
			//myArray.DeleteIndex(7);
			//myArray.Insert(20);
			//myArray.Insert(25);
			//prln(myArray.Linear(14));
			//myArray.SelectionSort();
			myArray.InsertionSort();
			
			myArray.PrintArray();
			
			
			
			
			sc.close();
		
	}
	
	

/* ----------------------my custom FUNCTION --------------------------*/
	
	static void prln(Object any){
		System.out.println(any);
	}
	static void pr(Object any){
		System.out.print(any);
	}
	
}
