import java.util.Iterator;
import java.util.LinkedList;

public class Students {

	public static void main(String[] args) {
		LinkedList<Student> linkedList= new LinkedList<Student>();
		linkedList.add(new Student(1, "ALİ", "VELİ"));
		linkedList.add(new Student(2, "ESMANUR", "KARATAŞ"));
		linkedList.add(new Student(3, "ASLI", "BONCUK"));
		linkedList.add(new Student(4, "ALİ", "DOMURCUK"));
		linkedList.add(new Student(5, "AHMET", "DOMURCUK"));
		
		Iterator<Student> iterator= linkedList.iterator();
		while(iterator.hasNext()) {
			Student student= iterator.next();
			System.out.println(student);
			
		}
		linkedList.remove(1);
	}

}
