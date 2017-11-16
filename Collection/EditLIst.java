import java.util.*;
class Untitled {
	public static void main(String[] args) {
		List<String>list1 = new ArrayList<String>();
		String[] s = {"APPLE","BANANA","PUMKIN","LICCHI"};
		String[] s2 = {"BANANA","LICCHI"};
		List<String>list2 = new LinkedList<String>();
		
		for (String x:s)
			list1.add(x);
		for (String y:s2)
			list2.add(y);
		
		list1.addAll(list2);
		list2.clear();
		
		editlist(list1, list2);
		reverseMe(list1);
		//removestuff(list1, 1,list1.size());
		for (int i=0;i<list1.size();i++)
			System.out.printf("%s ",list1.get(i));
		
	}
	
	public static void editlist(Collection<String>l1,List<String>l2){
		Iterator<String> it = l1.iterator();
		
		while(it.hasNext()){
			if(l2.contains(it.next()))
				it.remove();
		}
	}
	public static void removestuff(List<String>l,int from,int to){
		l.subList(from, to).clear();
		
	}
	public static void reverseMe(List<String>l){
		ListIterator<String>it = l.listIterator(l.size());
		while(it.hasPrevious())
			System.out.printf("%s ",it.previous());
		System.out.println();
	}
}