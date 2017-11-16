package ColletionExample;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListComparator {

	public static void main(String[] args) {
		List<Student> Stdlist = new LinkedList<Student>();
		Stdlist.add(new Student(18,"Mahbub",3.70));
		Stdlist.add(new Student(02,"Yasin",3.30));
		Stdlist.add(new Student(44,"Shuvo",3.50));
		Stdlist.add(new Student(101,"Rajib",3.49));
		Stdlist.add(new Student(10,"Rubel",3.85));
		
		//int index = Stdlist.indexOf(new Student().name.equals("Rajib"));
		//System.out.println(index);
		//System.out.println(Stdlist);
		/*Show all student info*/
		for(Student s : Stdlist){
			System.out.println("ID : "+s.ID+" Name : "+s.name +" Cgpa : "+s.cgpa);
		}
		/*Show all student info in CGPA order*/
		System.out.println("\nAfte Sort\n");
		Collections.sort(Stdlist , new cgpaSort());
		for(Student s : Stdlist){
			System.out.println("ID : "+s.ID+" Name : "+s.name +" Cgpa : "+s.cgpa);
		}
		
	}

}
/*need a comparator class to sort in particular way of data type*/
class cgpaSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.cgpa > o2.cgpa){
			return -1;
		}else if (o1.cgpa < o2.cgpa) {
			return 1;
		}
		return 0;
	}
	
}

/* making a student type variable class */
class Student{
	int ID;
	String name;
	double cgpa;
	public Student() {
		super();
	}
 	public Student(int id,String n,double cg){
		ID = id;
		name = n;
		cgpa = cg;
	}
}