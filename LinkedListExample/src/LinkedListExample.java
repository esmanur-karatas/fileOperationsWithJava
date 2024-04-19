import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer>integers= new LinkedList<>();
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(40);
		integers.add(50);
		integers.add(60);
		
		System.out.println("ELEMAN SAYISI: "+ integers.size()); //Eleman sayısını bastırır.
		
		System.out.println();
		
		//listenin en başındaki değeri kaldırırır
		 integers.remove();
		 
		 //istediğimiz indexteki elemanı kaldırır.
		 integers.remove(3);
		 
		 //verdiğimiz değeri kaldırır.
		 integers.remove(55);
		 
		//2. elemanı 55 yaptık. 30 da 55 ten sonra yazıldı yani 3. eleman oldu. 
		integers.add(2,55);
		System.out.println("KÜMENİN ELEMANLARI: ");
		Iterator<Integer> iterators= integers.iterator();
		while(iterators.hasNext()) {
			Integer next= iterators.next();
			System.out.println(next);
			
		}
		
		
		
	}

}
