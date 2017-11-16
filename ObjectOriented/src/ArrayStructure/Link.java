package ArrayStructure;

import java.util.Scanner;

public class Link {
	
	public String book;
	
	public Link next;
	
	public Link(String name){
		book = name;
	}
	
	public void display() {
		prln("Name of Book : "+book);
	}
	
	public String bookname() {
		return book;
	}
	
	
	
/** ----------------------Main  FUNCTION --------------------------**/

	public static void main(String[] args) {
		
		LinkList myLinkList = new LinkList();
		String books;
		
		
//		myLinkList.insert("Java");
//		myLinkList.insert("C++");
//		myLinkList.insert("Python");
		
//		myLinkList.remove();
//		myLinkList.removeLink("Python");
//		
		int n;
		pr("How many books want to store : ");
		n=sc.nextInt();
		prln("\n");
		for(int i=0;i<n;i++){
			books = sc.next();
			myLinkList.insert(books.toUpperCase());
		}
		myLinkList.display();
		books = sc.next();
		//myLinkList.insert(books);
		if(myLinkList.find(books.toUpperCase()) != null){
			prln("The book Found");
		}else{
			prln("NOt forund");
		}
		myLinkList.removeLink(books.toUpperCase());
		myLinkList.display();
	}
/** ----------------------Main  FUNCTION --------------------------**/
	
/* ----------------------my custom FUNCTION --------------------------*/
	static Scanner sc = new Scanner(System.in);
	
	public static  void prln(Object any){
		System.out.println(any);
	}
	public static void pr(Object any){
		System.out.print(any);
	}
/* ----------------------my custom FUNCTION --------------------------*/
}

class LinkList{
	public Link First;
	public LinkList() {
		First = null;
	}
	
	public boolean isEmpty() {
		return (First == null);
	}
	
	
	public void insert(String name) {
		Link newLink = new Link(name);
		
		newLink.next = First;
		First = newLink;
		
	}
	public Link remove() {
		Link Linkref = First;
		
		if(!isEmpty()){
			First = First.next;
		}else{
			System.out.println("Empty List");
		}
		return Linkref;
	}
	public void display() {
		Link thelink = First;
		
		while(thelink != null){
			
			thelink.display();
			thelink = thelink.next;
		}
	}
	
	public Link find(String name) {
		Link thelink = First;
		
		if(!isEmpty()){
			while(!thelink.book.equals(name)){
				if(thelink.next == null){
					return null;
				}else{
					thelink = thelink.next;
				}
			}
		}else{
			System.out.println("Empty List");
		}
		return thelink;
	}
	
	public void removeLink(String name) {
		Link current= First;
		Link perv  = First;
		
		while(!current.book.equals(name)){
			
			if(current.next == null){
				return;
			}else{
				perv = current;
				current = current.next;
			}
		}
		if(current == First){
			
			First = First.next;
		}else{
			
			//System.out.println("Found a Match");
			
			perv.next = current.next;
		}
		current = null;
		
				
	}
	
	
}