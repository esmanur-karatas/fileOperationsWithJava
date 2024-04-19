import java.util.Iterator;
import java.util.Vector;

public class VectorsExample {

	public static void main(String[] args) {
		Vector<Book> vector = new Vector<>(10);
		vector.add(new Book("X", 2020, new Author("Ali", "CAN")));
		vector.add(new Book("Y", 2024, new Author("Ahmet", "KAN")));
		vector.add(new Book("Z", 2023, new Author("Akın", "YAN")));
		vector.add(new Book("A", 2022, new Author("Ayşe", "VAN")));
		vector.add(new Book("B", 2021, new Author("Aslı", "TAN")));
		
		System.out.println("Vectör Değerleri: "+vector.size());
		System.out.println("Vectör Kapasitesi: "+vector.capacity());
		
		Iterator<Book> iterator = vector.iterator();
		while(iterator.hasNext()) {
			Book next = iterator.next();
			System.out.println(next);
		}

	}

}
