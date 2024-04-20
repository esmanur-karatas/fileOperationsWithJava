import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Tuğrul ÇALIŞKAN");
		
		int[] notes = {10,20,30,40,90};
		student.setNotes(notes);
		
		Iterator<Integer> iterator = student.iterator();
		while(iterator.hasNext()) {
			Integer integer = iterator.next();
			System.out.println(integer);
		}
		
	}

}
